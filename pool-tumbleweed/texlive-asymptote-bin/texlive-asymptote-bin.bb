SUMMARY = "Binary files of asymptote"
DESCRIPTION = "Binary files of asymptote"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66003"

RPM_NAME = "texlive-asymptote-bin-2023.20230311.svn66003-91.1.aarch64.rpm"
RPM_HASH = "ed7f0703bda46f24033f66c0a3ad379ef9cf3d74223d7c97bf15a2ca0d53784d66b5532e3b2f1c551e19f72340c22bb3749e843c07f59d705375232a7e05b262"

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
