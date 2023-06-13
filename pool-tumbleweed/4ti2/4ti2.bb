SUMMARY = "Package for algebraic, geometric and combinatorial problems on linear spaces"
DESCRIPTION = "4ti2 is a collection of programs that compute and solve algebraic, \
geometric and combinational problems on linear spaces."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.10"

RPM_NAME = "4ti2-1.6.10-1.1.aarch64.rpm"
RPM_HASH = "cc855f43d2c9c49033a63c63569994ef1850d8971c5d56d0de8167c4de117c1e132b02b7f0302492aa0ff3f4c4c5aca8d80872f19408a8a6d49062f6dfad1079"

RPROVIDES:${PN} += "4ti2 \
4ti2(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
lib4ti2gmp.so.0()(64bit) \
lib4ti2int32.so.0()(64bit) \
lib4ti2int64.so.0()(64bit) \
lib4ti2util.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libzsolve.so.0()(64bit)"

inherit rpm
