SUMMARY = "PHP Extension Module"
DESCRIPTION = "PHP's XSL extension implements the XSL (Extensible Stylesheet \
Language) standard, performing XSLT transformations using the libxslt \
library"
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-xsl-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "b9ace60afacf9c30e4689f286dc24828a962af0b1ceb6df46bc283fdb2878b544c867f7afb3142b597b1f639c23112e82d8950eee54e96c0be1ee22111ab4340"

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
