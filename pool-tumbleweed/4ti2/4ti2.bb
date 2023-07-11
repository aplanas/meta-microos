SUMMARY = "Package for algebraic, geometric and combinatorial problems on linear spaces"
DESCRIPTION = "4ti2 is a collection of programs that compute and solve algebraic, \
geometric and combinational problems on linear spaces."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.10"

RPM_NAME = "4ti2-1.6.10-1.2.aarch64.rpm"
RPM_HASH = "b74b50bfd49d37131d68e2a2d10e7370e1ce69a256305d649a121ff06499e3e99d515f2b46fdeb59c1ec5dd53ee5dde98ea5fc4304568a48654576c18aac4d3c"

RPROVIDES:${PN} += "4ti2"

RDEPENDS:${PN} += "/usr/bin/sh \
lib4ti2gmp.so.0 \
lib4ti2int32.so.0 \
lib4ti2int64.so.0 \
lib4ti2util.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libzsolve.so.0"

inherit rpm
