SUMMARY = "PHP development files for C/C++ extensions"
DESCRIPTION = "PHP is a server-side HTML embedded scripting language designed \
primarily for web development but also used as a general-purpose \
programming language. \
 \
This package contains the C headers to build PHP extensions."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-devel-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "f1102d4d1232e6c22d12d25999871c8a43da3ae1f26e4038712ff02ae78efe2725c392d03c9573c625110d6fbcb287ef3ee809d6a2d21b105844761f57c7c756"

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
