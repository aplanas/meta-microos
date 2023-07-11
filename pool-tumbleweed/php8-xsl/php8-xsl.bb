SUMMARY = "PHP Extension Module"
DESCRIPTION = "PHP's XSL extension implements the XSL (Extensible Stylesheet \
Language) standard, performing XSLT transformations using the libxslt \
library"
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-xsl-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "b47b28d4ceb5c3742938482a43e4943665c7587ed8d634b7815c0cb089a3dfcd9dfed29114734d4d6621a273681ae3191e9a1e08c87061b181a48be8bc6cc688"

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
