SUMMARY = "MinGW Windows compiler for Fortran shared libraries"
DESCRIPTION = "MinGW Windows compiler for Fortran shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-libgfortran5-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "f52acd13b9bb907f628596b21492339e25c66593691497288c8a877376453a5967bb9d529f4b628d548df40f805a97dd744d8444a48c3d44ee398c1de0b4942f"

RPROVIDES:${PN} += "mingw64-libgfortran \
mingw64-libgfortran-5.dll \
mingw64-libgfortran5"

RDEPENDS:${PN} += "mingw64-libgcc-s-seh-1.dll \
mingw64-libquadmath-0.dll \
mingw64-libwinpthread-1.dll"

inherit rpm
