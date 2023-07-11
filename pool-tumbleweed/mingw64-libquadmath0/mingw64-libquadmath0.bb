SUMMARY = "MinGW Windows Fortran Compiler Quadmath Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the Fortran \
compiler of the GNU Compiler Collection (GCC) and quadruple precision \
floating point operations."
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-libquadmath0-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "d7e7ad47df2bd96e4d9019af12a0ca4f1a76aedb094daf2ed31b6f1eaaddcec5f33d97bc115f86f528dc09f348624efd938d74ba9599a38f07c5bde6e67c095a"

RPROVIDES:${PN} += "mingw64-libquadmath-0.dll \
mingw64-libquadmath0"

RDEPENDS:${PN} += "mingw64-libgcc-s-seh-1.dll"

inherit rpm
