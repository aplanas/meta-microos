SUMMARY = "PHP development files for C/C++ extensions"
DESCRIPTION = "PHP is a server-side HTML embedded scripting language designed \
primarily for web development but also used as a general-purpose \
programming language. \
 \
This package contains the C headers to build PHP extensions."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-devel-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "c9faaf20169362029868f10b15a42892d5e21152ae6a2cef6194199e02bcec65ff7719a3a6b44e5794978de65e7bde69aea740bd92be2231c97510eeae888246"

RPROVIDES:${PN} += "php-devel \
php8-devel \
rpm-macro-pear-cfgdir \
rpm-macro-pear-datadir \
rpm-macro-pear-docdir \
rpm-macro-pear-metadir \
rpm-macro-pear-phpdir \
rpm-macro-pear-testdir \
rpm-macro-pear-wwwdir \
rpm-macro-pear-xmldir \
rpm-macro-pecl-datadir \
rpm-macro-pecl-docdir \
rpm-macro-pecl-phpdir \
rpm-macro-pecl-testdir \
rpm-macro-php-cfgdir \
rpm-macro-php-core-api \
rpm-macro-php-extdir \
rpm-macro-php-pear-gen-filelist \
rpm-macro-php-peardir \
rpm-macro-php-pearxmldir \
rpm-macro-php-version \
rpm-macro-php-zend-api"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc-devel \
php \
php8-pear \
php8-pecl \
pkgconfig-libpcre2-8 \
pkgconfig-libxml-2.0"

inherit rpm
