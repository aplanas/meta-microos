SUMMARY = "CA certificates for NSS"
DESCRIPTION = "This package contains the integrated CA root certificates from the \
Mozilla project."
LICENSE = "MPL-2.0"

PV = "3.92"

RPM_NAME = "mozilla-nss-certs-3.92-1.1.aarch64.rpm"
RPM_HASH = "59e86b9dfb4edbacb558d8f7bdc28d07fb43388e435cf9ab09c00a757c7e8824b922c66ce5ecfa7c05a522f0017e9ea2fccb09e8e85e9e58ba7340492952125d"

RPROVIDES:${PN} += "libnssckbi.so \
mozilla-nss-certs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libplc4.so \
libplds4.so"

inherit rpm
