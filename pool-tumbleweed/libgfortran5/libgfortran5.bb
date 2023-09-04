SUMMARY = "The GNU Fortran Compiler Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the Fortran compiler \
of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.2.1+git7683"

RPM_NAME = "libgfortran5-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "923f037a7d3d5d917f15b13b22ebe86d74bf509b286c654ae0a3613ca9d19ce1c94afd2c9b3702fc4e197cc244c5dce477f095280c1d92fedfb7ec3db42624aa"

RPROVIDES:${PN} += "libgfortran.so.5 \
libgfortran5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
