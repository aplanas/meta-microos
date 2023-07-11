SUMMARY = "MinGW Windows compiler for Fortran shared libraries"
DESCRIPTION = "MinGW Windows compiler for Fortran shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-libgfortran5-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "2d9d2335908a10b69c23151a84388dc213032fae7dcd0f1c167131cef63b90d006800eba70388af0fce06366a445f07e551c202677c63cf826ad75284fbda724"

RPROVIDES:${PN} += "mingw32-libgfortran \
mingw32-libgfortran-5.dll \
mingw32-libgfortran5"

RDEPENDS:${PN} += "mingw32-libgcc-s-sjlj-1.dll \
mingw32-libquadmath-0.dll \
mingw32-libwinpthread-1.dll"

inherit rpm
