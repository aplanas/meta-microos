SUMMARY = "The core library for giac"
DESCRIPTION = "A computer algebra system, compatible with existing CAS, as a C++ \
library with various user interfaces (GUI with formal spreadsheet and exact \
dynamic geometry, on-line, readline, emacs, texmacs...)."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.0.27"

RPM_NAME = "libgiac0-1.9.0.27-4.5.aarch64.rpm"
RPM_HASH = "5064bcbe8114cf79953888aa495055685262b6033667933ee2228135ed5423bb8a864894bf9f3dffc7e984147cda650a2b7c9738d8b73215e3af0ac6f1fc1a64"

RPROVIDES:${PN} += "libgiac.so.0 \
libgiac0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libao.so.4 \
libblas.so.3 \
libc.so.6 \
libcurl.so.4 \
libecm.so.1 \
libgcc-s.so.1 \
libglpk.so.40 \
libgmp.so.10 \
libgsl.so.27 \
libgslcblas.so.0 \
liblapack.so.3 \
libm.so.6 \
libmpfi.so.0 \
libmpfr.so.6 \
libnauty-2.8.6.so \
libntl.so.44 \
libpari-gmp-tls.so.8 \
libpng16.so.16 \
libsamplerate.so.0 \
libstdc++.so.6"

inherit rpm
