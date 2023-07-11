SUMMARY = "The GNU Fortran Compiler Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the Fortran compiler \
of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "12.3.0+git1204"

RPM_NAME = "libgfortran5-gcc12-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "3c148d125a8871ef1998e29ddb00db493149d9d029802b4aa0f151b2ab5652ba52d92d5593415dc64c29aa98e93206affda727b45accdbb8d8f2d94068fc01ea"

RPROVIDES:${PN} += "libgfortran.so.5 \
libgfortran5 \
libgfortran5-gcc12"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
