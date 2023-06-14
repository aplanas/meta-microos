SUMMARY = "R language libraries"
DESCRIPTION = "This package contains the files from R/lib to make their usage \
possible without installing a complete R. (I.e. VTK uses this)"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-core-libs-4.3.0-45.2.aarch64.rpm"
RPM_HASH = "1b5cc4650b4ca99b0625d13a1b5fce4af90e562ab161e0f7ce51f06748289b7c6fda246358a299dc566ab5d8090d6d2f1b42750bec5a7887d07a6365acf53557"

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
