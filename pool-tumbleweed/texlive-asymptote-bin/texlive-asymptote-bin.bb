SUMMARY = "Binary files of asymptote"
DESCRIPTION = "Binary files of asymptote"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66003"

RPM_NAME = "texlive-asymptote-bin-2023.20230311.svn66003-92.1.aarch64.rpm"
RPM_HASH = "66041a10b3e8eba4ac1add9bac251e7f02a25a85dd0b90c6bbcc8297bd99bda6de25f7b5a266f746a5cd3bec18f744ca78dd359781f1c8b8065ca4d7cac03fd9"

RPROVIDES:${PN} += "texlive-asymptote-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOSMesa.so.8 \
libc.so.6 \
libfftw3.so.3 \
libgc.so.1 \
libgcc-s.so.1 \
libglut.so.3 \
libgsl.so.27 \
libgslcblas.so.0 \
libm.so.6 \
libreadline.so.8 \
libsigsegv.so.2 \
libstdc++.so.6 \
libtinfo.so.6 \
libz.so.1 \
texlive-asymptote"

inherit rpm
