SUMMARY = "The GNU Fortran Compiler Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the Fortran compiler \
of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7597"

RPM_NAME = "libgfortran5-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "0909f8c11b2c156a871fc9d8178f7fea8654eca2c8c88f531ac81ba7f68331d4f52349558b52eb192dbac280d689932bba02f9317a2f87dd0d01a2b67490db04"

RPROVIDES:${PN} += "libgfortran.so.5 \
libgfortran5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
