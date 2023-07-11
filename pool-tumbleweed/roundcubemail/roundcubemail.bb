SUMMARY = "A browser-based multilingual IMAP client"
DESCRIPTION = "Roundcube Webmail is a browser-based multilingual IMAP client with an \
application-like user interface. It provides MIME support, address \
book, folder manipulation, message searching and spell checking. \
 \
Roundcube Webmail is written in PHP and requires a MySQL database. \
The user interface is skinnable using XHTML and CSS 2."
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-or-later"

PV = "1.6.2"

RPM_NAME = "roundcubemail-1.6.2-1.1.noarch.rpm"
RPM_HASH = "c890805dc7343c71dc60403afb16433bb30a2b23ed709399f17de5ff5d146f46f499342acae7200d1efe5690b1f0b47c7b930509b2ab3677f12c436e242f12ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-roundcubemail \
roundcube-framework \
roundcubemail"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/php \
/usr/bin/sh \
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
