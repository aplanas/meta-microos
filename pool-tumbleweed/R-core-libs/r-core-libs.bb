SUMMARY = "R language libraries"
DESCRIPTION = "This package contains the files from R/lib to make their usage \
possible without installing a complete R. (I.e. VTK uses this)"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.1"

RPM_NAME = "R-core-libs-4.3.1-46.1.aarch64.rpm"
RPM_HASH = "671fa27e8d50f0947b277b7ce167bc08f1c68a8121ca9844e29254276400cd35bf9279fe2361869277dd240380279cd0966f3a3a6de61dec8124763e1d59d9c7"

RPROVIDES:${PN} += "R-core-libs \
config-R-core-libs \
libR.so \
libRblas.so \
libRlapack.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libgomp.so.1 \
libicui18n.so.73 \
libicuuc.so.73 \
liblzma.so.5 \
libm.so.6 \
libpcre2-8.so.0 \
libreadline.so.8 \
libz.so.1"

inherit rpm
