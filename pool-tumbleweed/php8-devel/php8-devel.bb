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
php8-devel(aarch-64) \
rpm_macro(pear_cfgdir) \
rpm_macro(pear_datadir) \
rpm_macro(pear_docdir) \
rpm_macro(pear_metadir) \
rpm_macro(pear_phpdir) \
rpm_macro(pear_testdir) \
rpm_macro(pear_wwwdir) \
rpm_macro(pear_xmldir) \
rpm_macro(pecl_datadir) \
rpm_macro(pecl_docdir) \
rpm_macro(pecl_phpdir) \
rpm_macro(pecl_testdir) \
rpm_macro(php_cfgdir) \
rpm_macro(php_core_api) \
rpm_macro(php_extdir) \
rpm_macro(php_pear_gen_filelist) \
rpm_macro(php_peardir) \
rpm_macro(php_pearxmldir) \
rpm_macro(php_version) \
rpm_macro(php_zend_api)"
RDEPENDS:${PN} += "/bin/sh \
glibc-devel \
php \
php8-pear \
php8-pecl \
pkgconfig(libpcre2-8) \
pkgconfig(libxml-2.0)"

inherit rpm
