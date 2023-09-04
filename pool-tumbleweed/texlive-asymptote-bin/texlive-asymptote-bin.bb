SUMMARY = "Binary files of asymptote"
DESCRIPTION = "Binary files of asymptote"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66003"

RPM_NAME = "texlive-asymptote-bin-2023.20230311.svn66003-93.2.aarch64.rpm"
RPM_HASH = "ae6231b92fbd6f46358dd0dad60c5f1b66e803ee1189d2738a76a99e34c7100c5701a58314dbb89d9386c270d6a4495ad1889c20bb5c00473576cda6ca8292a3"

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
