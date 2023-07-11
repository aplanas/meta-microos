SUMMARY = "MinGW Windows Fortran Compiler Quadmath Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the Fortran \
compiler of the GNU Compiler Collection (GCC) and quadruple precision \
floating point operations."
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-libquadmath0-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "0aa169c0fe4b09746eee45a2baaa34d936dda143c9f564e02f4c6910dba9d708d60d210add969aae1ef4fc3cb1fbee167562ec1b56b023dafdf55553a935cd24"

RPROVIDES:${PN} += "mingw32-libquadmath-0.dll \
mingw32-libquadmath0"

RDEPENDS:${PN} += "mingw32-libgcc-s-sjlj-1.dll"

inherit rpm
