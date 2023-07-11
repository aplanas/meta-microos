SUMMARY = "CA certificates for NSS"
DESCRIPTION = "This package contains the integrated CA root certificates from the \
Mozilla project."
LICENSE = "MPL-2.0"

PV = "3.90"

RPM_NAME = "mozilla-nss-certs-3.90-1.1.aarch64.rpm"
RPM_HASH = "ceffffc09a620b25be5639fde1ec8ea40f51b686c8bbcaa91cac8f5b86a92e0bad2b14d856820b9107623f0249bf9819460ad1c5529eec0b4486318f45bd00d7"

RPROVIDES:${PN} += "libnssckbi.so \
mozilla-nss-certs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libplc4.so \
libplds4.so"

inherit rpm
