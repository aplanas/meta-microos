SUMMARY = "Libraries for the GNU Astronomy Utilities"
DESCRIPTION = "Libraries for the manipulation and analysis of astronomical data, \
part of the GNU Astronomy Utilities (Gnuastro)."
LICENSE = "GPL-3.0-or-later"

PV = "0.19"

RPM_NAME = "libgnuastro17-0.19-1.12.aarch64.rpm"
RPM_HASH = "0d1e6ef3b0945405e1d24b33510e6f1398135a77a16dcbf9f52191c8d179a4481763ed8f3759d837d4db838d2c672c3e76c63d40f5fc636ec32cd0fb1ee2fcad"

RPROVIDES:${PN} += "libgnuastro.so.17 \
libgnuastro17"

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
