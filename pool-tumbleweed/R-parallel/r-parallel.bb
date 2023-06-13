SUMMARY = "Package providing R-parallel"
DESCRIPTION = "This package provides R-parallel, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-parallel-4.3.0-45.2.aarch64.rpm"
RPM_HASH = "f23cce9535b8f2d8c6443d65d78b6c11408c01f541d93fc50e796c26639f3d799da4065999533636c5bcf7fe0042dbefba3b8153f81680c64660ab99fb70ffa5"

RPROVIDES:${PN} += "R-parallel \
R-parallel(aarch-64)"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1()(64bit) \
libR.so()(64bit) \
libc.so.6()(64bit)"

inherit rpm
