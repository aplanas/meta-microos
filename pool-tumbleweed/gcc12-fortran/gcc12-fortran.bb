SUMMARY = "The GNU Fortran Compiler and Support Files"
DESCRIPTION = "This is the Fortran compiler of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "gcc12-fortran-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "6505c0bc657643d3050cb8ce3c32007338306030f6bf1d5225a425e7c29232633f513ced4de6176baddf2353c9bba7629806c107ffd25d56c86170370d7d5e2f"

RPROVIDES:${PN} += "gcc12-fortran"

RDEPENDS:${PN} += "gcc12 \
libc.so.6 \
libgfortran5 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
