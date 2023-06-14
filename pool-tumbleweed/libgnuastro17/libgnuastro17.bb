SUMMARY = "Libraries for the GNU Astronomy Utilities"
DESCRIPTION = "Libraries for the manipulation and analysis of astronomical data, \
part of the GNU Astronomy Utilities (Gnuastro)."
LICENSE = "GPL-3.0-or-later"

PV = "0.19"

RPM_NAME = "libgnuastro17-0.19-1.10.aarch64.rpm"
RPM_HASH = "17ed0186b04d228931ac800e8410b8a7245d882a51965685c74c93757d15ad580776af8a53beca2ba8908ef2abeedce5ff752a66c4d1f1e97d656a04a2428707"

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
