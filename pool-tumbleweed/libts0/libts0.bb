SUMMARY = "Abstraction layer for touchscreens"
DESCRIPTION = "Tslib is an abstraction layer for touchscreen panel events. \
 \
The idea of tslib is to have a core library and a set of plugins to \
manage the conversion and filtering as needed."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only"

PV = "1.22"

RPM_NAME = "libts0-1.22-1.10.aarch64.rpm"
RPM_HASH = "9870d856d4bd7496c51d7be268d301b6597b9bdd16c575d8682fcb535f7b421677262885ed6abd8a7ded7ec0d42a99856efcca57aac90911304e1a12222d9e8d"

RPROVIDES:${PN} += "libts.so.0 \
libts0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
