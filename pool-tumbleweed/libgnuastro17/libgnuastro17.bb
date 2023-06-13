SUMMARY = "Libraries for the GNU Astronomy Utilities"
DESCRIPTION = "Libraries for the manipulation and analysis of astronomical data, \
part of the GNU Astronomy Utilities (Gnuastro)."
LICENSE = "GPL-3.0-or-later"

PV = "0.19"

RPM_NAME = "libgnuastro17-0.19-1.10.aarch64.rpm"
RPM_HASH = "17ed0186b04d228931ac800e8410b8a7245d882a51965685c74c93757d15ad580776af8a53beca2ba8908ef2abeedce5ff752a66c4d1f1e97d656a04a2428707"

RPROVIDES:${PN} += "libgnuastro.so.17()(64bit) \
libgnuastro17 \
libgnuastro17(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcfitsio.so.10()(64bit) \
libgit2.so.1.6()(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libm.so.6()(64bit) \
libtiff.so.6()(64bit) \
libwcs.so.7()(64bit)"

inherit rpm
