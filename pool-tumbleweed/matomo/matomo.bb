SUMMARY = "Web analytics platform"
DESCRIPTION = "Matomo, formerly Piwik, is a web analytics platform that gives \
insights into a website's visitors and marketing campaigns, so the \
strategy and online experience of visitors may be optimized."
LICENSE = "GPL-3.0-or-later"

PV = "4.14.2"

RPM_NAME = "matomo-4.14.2-1.2.noarch.rpm"
RPM_HASH = "faefa8bc4270ac7d8c77c4a213cd25e5965ac99b72910e8e989ae3256375eb7286ab6537b3c8f4c8043093b6489af58d4cc793fc45725cec65c8c90ac12e36db"
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
