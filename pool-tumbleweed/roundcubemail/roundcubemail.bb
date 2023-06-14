SUMMARY = "A browser-based multilingual IMAP client"
DESCRIPTION = "Roundcube Webmail is a browser-based multilingual IMAP client with an \
application-like user interface. It provides MIME support, address \
book, folder manipulation, message searching and spell checking. \
 \
Roundcube Webmail is written in PHP and requires a MySQL database. \
The user interface is skinnable using XHTML and CSS 2."
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-or-later"

PV = "1.6.1"

RPM_NAME = "roundcubemail-1.6.1-1.1.noarch.rpm"
RPM_HASH = "2a6afe082ad7ad6005c9b95a84bc53dd27af159d4941f02c5df5c6edb6dea6dfdbd664cf6bbfba834c3c635d8a9790944c870a7b24364bb9bb24faf981090f5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-roundcubemail \
roundcube-framework \
roundcubemail"

RDEPENDS:${PN} += "-php-mysql or php-pgsql \
/bin/sh \
/usr/bin/env \
/usr/bin/php \
mod-php-any \
php-dom \
php-exif \
php-gettext \
php-iconv \
php-intl \
php-json \
php-mbstring \
php-openssl \
php-pear-Auth-SASL \
php-pear-MDB2-Driver-mysqli \
php-pear-Mail-Mime \
php-pear-Net-IDNA2 \
php-pear-Net-LDAP2 \
php-pear-Net-SMTP \
php-pear-Net-Sieve \
php-pear-Net-Socket \
php-sockets"

inherit rpm
