SUMMARY = "Libraries for the GNU Astronomy Utilities"
DESCRIPTION = "Libraries for the manipulation and analysis of astronomical data, \
part of the GNU Astronomy Utilities (Gnuastro)."
LICENSE = "GPL-3.0-or-later"

PV = "0.19"

RPM_NAME = "libgnuastro17-0.19-1.11.aarch64.rpm"
RPM_HASH = "d57305d501385e28862818359e10707bb2cf872f030c40f891ed78aef36f615144c54cdd2841c74d8b3528aa6ab20267ff98d31089fd174844d48c41128eb1e8"

RPROVIDES:${PN} += "libgnuastro.so.17 \
libgnuastro17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libgit2.so.1.6 \
libgsl.so.27 \
libgslcblas.so.0 \
libjpeg.so.8 \
libm.so.6 \
libtiff.so.6 \
libwcs.so.7"

inherit rpm
