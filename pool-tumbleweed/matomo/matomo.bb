SUMMARY = "Web analytics platform"
DESCRIPTION = "Matomo, formerly Piwik, is a web analytics platform that gives \
insights into a website's visitors and marketing campaigns, so the \
strategy and online experience of visitors may be optimized."
LICENSE = "GPL-3.0-or-later"

PV = "4.15.0"

RPM_NAME = "matomo-4.15.0-1.1.noarch.rpm"
RPM_HASH = "f08ee172e92e4c2e6058de1206eec2f2938d3174d4099cf4f6a2df826fa5425704517e4d39df004a1e8652dfd6849e44c9898049edfa971e5cbe42b8f46ada99"
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
