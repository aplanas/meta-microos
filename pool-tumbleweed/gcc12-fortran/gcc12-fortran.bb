SUMMARY = "The GNU Fortran Compiler and Support Files"
DESCRIPTION = "This is the Fortran compiler of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "gcc12-fortran-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "ac39d6fdc477766469c949d4cb60fa96530a0c9d2c76ee2243ef943f9cdd337347c49b49365038c7d0d895c8dd9205cd88d5ac01f0ce9aa96a05a3a2b5298180"

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
