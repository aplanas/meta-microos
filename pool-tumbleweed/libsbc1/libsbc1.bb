SUMMARY = "Bluetooth Low-Complexity, Sub-Band Codec Library"
DESCRIPTION = "The package contains libraries for using the SBC codec."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5"

RPM_NAME = "libsbc1-1.5-2.12.aarch64.rpm"
RPM_HASH = "c52fb05cc31a9a815019985ae1d7dfb4888852433b8a63f002cd0c890ea46a754dc7a0582eec753e51cde7b0e8b80713279d9b68dff5e00db2006119da482f1c"

RPROVIDES:${PN} += "libsbc.so.1 \
libsbc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
