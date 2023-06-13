SUMMARY = "Software for reading and writing Data Matrix barcodes"
DESCRIPTION = "libdmtx is open source software for reading and writing Data Matrix barcodes. \
At its core libdmtx is a native shared library, allowing C/C++ programs to use \
its capabilities without extra restrictions or overhead."
LICENSE = "BSD-2-Clause"

PV = "0.7.7"

RPM_NAME = "libdmtx0-0.7.7-1.4.aarch64.rpm"
RPM_HASH = "ce8928b489c7609365785a3f3f395abdb4949813bcab6e0aae1cfc2eafecfcbc5afd4c908b8f660060dee0b00a7a00dd6db3f33d35a435c8d30be7478887ff66"

RPROVIDES:${PN} += "libdmtx.so.0()(64bit) \
libdmtx0 \
libdmtx0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
