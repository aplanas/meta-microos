SUMMARY = "PHP Extension Module"
DESCRIPTION = "PHP's XSL extension implements the XSL (Extensible Stylesheet \
Language) standard, performing XSLT transformations using the libxslt \
library"
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-xsl-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "bdea0e22bd7c28890d61e1312cdf44dc1b0481df6bac1ff66c7783b43ffdfedfc0ad985535da3ba2191961641a67f81990f0ad11bf40ac31cf121fb7003c7189"

RPROVIDES:${PN} += "config(php8-xsl) \
php-xsl \
php8-xsl \
php8-xsl(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libexslt.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxslt.so.1()(64bit) \
php \
php-dom"

inherit rpm
