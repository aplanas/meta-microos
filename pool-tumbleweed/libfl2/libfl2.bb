SUMMARY = "Libraries for flex"
DESCRIPTION = "FLEX is a tool for generating scanners: programs that recognize lexical \
patterns in text. \
 \
This package contains libraries for using flex."
LICENSE = "BSD-3-Clause"

PV = "2.6.4"

RPM_NAME = "libfl2-2.6.4-6.20.aarch64.rpm"
RPM_HASH = "d548579a06b1f04d4c14866a8b8895e9a50e8132a8e6e079eeabe345af495eb46e4ea6c6b78396e73e80c39539593cebafa793556960d307351f4baafa88e8be"

RPROVIDES:${PN} += "libfl.so.2()(64bit) \
libfl2 \
libfl2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit)"

inherit rpm
