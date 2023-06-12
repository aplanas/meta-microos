SUMMARY = "MinGW Windows Fortran Compiler Quadmath Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the Fortran \
compiler of the GNU Compiler Collection (GCC) and quadruple precision \
floating point operations."
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-libquadmath0-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "42f84d64477b2642b3fb49674158505a8d287f6fd0a4e545e8c70b0a14a46f0e91347621505148f87f1f2aebf9f2729e7caa049c122e7fb4a439a6f7828cba9b"

RPROVIDES:${PN} += "mingw32(libquadmath-0.dll) \
mingw32-libquadmath0 \
mingw32-libquadmath0(aarch-64)"
RDEPENDS:${PN} += "mingw32(libgcc_s_sjlj-1.dll)"

inherit rpm
