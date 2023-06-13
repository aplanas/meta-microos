SUMMARY = "FDTD finite-difference time-domain solver library"
DESCRIPTION = "Meep (or MEEP) is a free finite-difference time-domain (FDTD) \
simulation software package developed at MIT to model electromagnetic \
systems."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "libmeep31-1.26.0-1.3.aarch64.rpm"
RPM_HASH = "84326a37241720402a23f99825b1197f7ca102580f79869785f6e47573c899bc9e8f007f4241a8ce843b4a1639ea20efad1646fe703f6e1ffb72bf727650003d"

RPROVIDES:${PN} += "libmeep.so.31()(64bit) \
libmeep31 \
libmeep31(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libctlgeom.so.7()(64bit) \
libfftw3.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libharminv.so.3()(64bit) \
libhdf5.so.200()(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
