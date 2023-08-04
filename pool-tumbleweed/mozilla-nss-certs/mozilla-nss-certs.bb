SUMMARY = "CA certificates for NSS"
DESCRIPTION = "This package contains the integrated CA root certificates from the \
Mozilla project."
LICENSE = "MPL-2.0"

PV = "3.91"

RPM_NAME = "mozilla-nss-certs-3.91-1.1.aarch64.rpm"
RPM_HASH = "e90bec129fd0dfa90d372dca5601bef30fe58a54cb79b50bbbf4bc1a86d8b98d85043f2c6be48cf4e797cf14d670562a258138046741fc79a60a008c0b77d9d8"

RPROVIDES:${PN} += "libnssckbi.so \
mozilla-nss-certs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libplc4.so \
libplds4.so"

inherit rpm
