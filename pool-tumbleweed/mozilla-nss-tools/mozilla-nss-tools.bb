SUMMARY = "Tools for developing, debugging, and managing applications that use NSS"
DESCRIPTION = "The NSS Security Tools allow developers to test, debug, and manage \
applications that use NSS."
LICENSE = "MPL-2.0"

PV = "3.90"

RPM_NAME = "mozilla-nss-tools-3.90-2.1.aarch64.rpm"
RPM_HASH = "eb72dcc6648de3eb06e558261b67b0e2f978c4d0adc1f604f07ac4da27c99813f5dcd15f744f8aac1869de77e1abaf10c8f98073d3213cf295699080a4a21dce"

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
