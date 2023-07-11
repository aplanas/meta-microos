SUMMARY = "The GNU Fortran Compiler Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the Fortran compiler \
of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libgfortran4-7.5.0+r278197-14.6.aarch64.rpm"
RPM_HASH = "702cf2f591660be14dd32ce171c509c6d901df1a193c2410a2d8b1a55699598f5a6f669b6bb4c1e53af5fe5ba9b5a5d40feafc49cdfc24a477a2ec7fcf00f54e"

RPROVIDES:${PN} += "libgfortran.so.4 \
libgfortran4"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
