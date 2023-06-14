SUMMARY = "CA certificates for NSS"
DESCRIPTION = "This package contains the integrated CA root certificates from the \
Mozilla project."
LICENSE = "MPL-2.0"

PV = "3.89"

RPM_NAME = "mozilla-nss-certs-3.89-2.1.aarch64.rpm"
RPM_HASH = "4cfb9ef9818f88dabdb86be4a070fcf3edaf3b71e0222632bc8594798c36661037d186bd2904d210025dcec401161af010a7e7093d407048f7b96a8efc313e8e"

RPROVIDES:${PN} += "libnssckbi.so \
mozilla-nss-certs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libplc4.so \
libplds4.so"

inherit rpm
