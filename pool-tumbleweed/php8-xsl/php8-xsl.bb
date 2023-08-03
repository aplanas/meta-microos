SUMMARY = "PHP Extension Module"
DESCRIPTION = "PHP's XSL extension implements the XSL (Extensible Stylesheet \
Language) standard, performing XSLT transformations using the libxslt \
library"
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-xsl-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "1c6f46a1f651e94de86093f1b10f6c08fb9502d1b999e51232bfb7db29be853ac489a1bdc3117973d9d0d0d1dfc45ccf951907abc8d98f6a2e136dc1edb42f63"

RPROVIDES:${PN} += "config-php8-xsl \
php-xsl \
php8-xsl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexslt.so.0 \
libxml2.so.2 \
libxslt.so.1 \
php \
php-dom"

inherit rpm
