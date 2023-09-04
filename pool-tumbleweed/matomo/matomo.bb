SUMMARY = "Web analytics platform"
DESCRIPTION = "Matomo, formerly Piwik, is a web analytics platform that gives \
insights into a website's visitors and marketing campaigns, so the \
strategy and online experience of visitors may be optimized."
LICENSE = "GPL-3.0-or-later"

PV = "4.15.1"

RPM_NAME = "matomo-4.15.1-1.1.noarch.rpm"
RPM_HASH = "7ee2da3ec1bb3679d6a5d28946a5231b6a539a5e1fa89e06d8b26ee6648665a49cabf4ddeb53192822114f624dfb669b3e5040cc6f6607efbf6ebe9335208a81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-matomo \
matomo"

RDEPENDS:${PN} += "/usr/bin/php \
/usr/bin/python3 \
/usr/bin/sh \
group-www \
logrotate \
nodejs \
php \
php-ctype \
php-curl \
php-dom \
php-gd \
php-iconv \
php-json \
php-mbstring \
php-mysql \
php-pdo \
php-tokenizer \
php-xmlreader \
php-xmlwriter \
php-zlib \
python3 \
systemd \
user-wwwrun"

inherit rpm
