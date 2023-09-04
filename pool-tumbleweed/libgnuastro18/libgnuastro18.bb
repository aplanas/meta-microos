SUMMARY = "Libraries for the GNU Astronomy Utilities"
DESCRIPTION = "Libraries for the manipulation and analysis of astronomical data, \
part of the GNU Astronomy Utilities (Gnuastro)."
LICENSE = "GPL-3.0-or-later"

PV = "0.20"

RPM_NAME = "libgnuastro18-0.20-1.1.aarch64.rpm"
RPM_HASH = "94abed28f23c9a2ba922451489abd89211eb3ae72ff2e4b13c84198f7685faf26ee18d8d0af2cc84ddfd58f0429a5f062aefdb79b3669992bbe126d3c557794f"

RPROVIDES:${PN} += "libgnuastro.so.18 \
libgnuastro18"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libgit2.so.1.7 \
libgsl.so.27 \
libgslcblas.so.0 \
libjpeg.so.8 \
libm.so.6 \
libtiff.so.6 \
libwcs.so.7"

inherit rpm
