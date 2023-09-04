SUMMARY = "PHP Extension Module"
DESCRIPTION = "PHP's XSL extension implements the XSL (Extensible Stylesheet \
Language) standard, performing XSLT transformations using the libxslt \
library"
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-xsl-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "25d45f8360f418c40b068ab51c1934c0b35bb0e646824595e58d70c62a56545b76f1bcbba2d7e30ed187220cd2ef6c59399430c93fedece70493bb330074427e"

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
