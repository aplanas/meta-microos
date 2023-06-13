SUMMARY = "The Colm programming language runtime"
DESCRIPTION = "Colm is a programming language designed for the analysis and \
transformation of computer languages."
LICENSE = "MIT"

PV = "0.14.7"

RPM_NAME = "libfsm-0_14_7-0.14.7-2.4.aarch64.rpm"
RPM_HASH = "d5b89904d9731a9e09fc71619ef70c64d35bb4313e29378e8fce26c00f785e7a8024482c1da2d220b79ea3cacaaba734571b148b23f4d86fb0715316584787be"

RPROVIDES:${PN} += "libfsm-0.14.7.so()(64bit) \
libfsm-0_14_7 \
libfsm-0_14_7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
