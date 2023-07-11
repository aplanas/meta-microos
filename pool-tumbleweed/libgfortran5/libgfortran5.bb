SUMMARY = "The GNU Fortran Compiler Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the Fortran compiler \
of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7364"

RPM_NAME = "libgfortran5-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "a79850629e467aaae4f66c740c3ca270758637cb550faf8ca5fc92dd4e6f6f6bc850a8bf074e9ea238333cffae5c7371f11237c22065a0e03a326abdc0f61c2c"

RPROVIDES:${PN} += "libgfortran.so.5 \
libgfortran5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
