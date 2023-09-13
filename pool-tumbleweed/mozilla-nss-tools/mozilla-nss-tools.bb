SUMMARY = "Tools for developing, debugging, and managing applications that use NSS"
DESCRIPTION = "The NSS Security Tools allow developers to test, debug, and manage \
applications that use NSS."
LICENSE = "MPL-2.0"

PV = "3.93"

RPM_NAME = "mozilla-nss-tools-3.93-1.1.aarch64.rpm"
RPM_HASH = "2e8a13eadfb707e9c2d9fe9eae9aca1aea0509fedb4a4d42e38478fab70aa1d337e9e58e8d9e75cffbf357c086ed526b21270c2824c52a1e3cb3babd5c967305"

RPROVIDES:${PN} += "mozilla-nss-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libnss3.so \
libnssutil3.so \
libplc4.so \
libplds4.so \
libsmime3.so \
libssl3.so \
libz.so.1 \
mozilla-nss"

inherit rpm
