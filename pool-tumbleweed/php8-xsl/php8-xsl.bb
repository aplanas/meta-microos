SUMMARY = "PHP Extension Module"
DESCRIPTION = "PHP's XSL extension implements the XSL (Extensible Stylesheet \
Language) standard, performing XSLT transformations using the libxslt \
library"
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-xsl-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "04fca47fb4dd62902ac32c8711b8cbbd7fa5e3f74d763da6420aaaf79d759d343c21db36adefb1338c2b6f0e76f9dedf751593e464134fd510872235b3e7468f"

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
