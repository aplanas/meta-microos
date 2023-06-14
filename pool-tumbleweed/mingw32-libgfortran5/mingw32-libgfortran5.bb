SUMMARY = "MinGW Windows compiler for Fortran shared libraries"
DESCRIPTION = "MinGW Windows compiler for Fortran shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-libgfortran5-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "accb675ead605c8dd576f60bcbf2517e59a698f79455d6ab0bf069900c5584d3bbc3e1f297c6ba5856bfeed6e2f25940b15def4c7723fb028dbc102e2f9a6a78"

RPROVIDES:${PN} += "mingw32-libgfortran \
mingw32-libgfortran-5.dll \
mingw32-libgfortran5"

RDEPENDS:${PN} += "mingw32-libgcc-s-sjlj-1.dll \
mingw32-libquadmath-0.dll \
mingw32-libwinpthread-1.dll"

inherit rpm
