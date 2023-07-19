SUMMARY = "Binary files of asymptote"
DESCRIPTION = "Binary files of asymptote"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66003"

RPM_NAME = "texlive-asymptote-bin-2023.20230311.svn66003-93.1.aarch64.rpm"
RPM_HASH = "b564e9a6d2b57937d8cb24180ce21ce5de0863e14f25af6c8a1226e1d7d117abdf8d0c2031699afc1a02b28d927f1770d6dc7de7c927bcf084e4fca66cfe19b9"

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
