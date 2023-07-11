SUMMARY = "The GNU Fortran Compiler and Support Files"
DESCRIPTION = "This is the Fortran compiler of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-fortran-7.5.0+r278197-14.6.aarch64.rpm"
RPM_HASH = "8864871dd4cfe5c5c6b1c5ce688c2afc0225f22c98fce36612b2814415f9f03af81719404343d5954bb4665e03bea81d7786cf3a958a28f83c50c9a388547882"

RPROVIDES:${PN} += "gcc7-fortran"

RDEPENDS:${PN} += "gcc7 \
libc.so.6 \
libgfortran4 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
