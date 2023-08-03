SUMMARY = "CA certificates for NSS"
DESCRIPTION = "This package contains the integrated CA root certificates from the \
Mozilla project."
LICENSE = "MPL-2.0"

PV = "3.90"

RPM_NAME = "mozilla-nss-certs-3.90-2.1.aarch64.rpm"
RPM_HASH = "d79047749d149191d6ae90c11cc7136bd00ac5607a53026c0e6e1b537b3b3493050c958d928a6980a5c23cf39af1a7c2d3828376be41b263a9c7f20b4d1d1e3c"

RPROVIDES:${PN} += "libnssckbi.so \
mozilla-nss-certs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libplc4.so \
libplds4.so"

inherit rpm
