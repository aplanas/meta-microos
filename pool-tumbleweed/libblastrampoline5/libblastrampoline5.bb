SUMMARY = "BLAS/LAPACK demuxer library using PLT trampolines"
DESCRIPTION = "libblastrampoline is a BLAS/LAPACK demuxer library that uses PLT \
trampolines and implements a consistent API atop BLAS implementations \
(like OpenBLAS, MKL, etc.) that differ in their function argument \
types (e.g. 32-bit vs. 64-bit array indices) and/or function names \
(dgemm vs. dgemm_)."
LICENSE = "MIT"

PV = "5.8.0"

RPM_NAME = "libblastrampoline5-5.8.0-1.1.aarch64.rpm"
RPM_HASH = "64c0f2574ab228630486981404b7ccacb3693f061744828ddefef8caf47aafe574967fdb0de515105966cf3d78c180a8a0ab75b97e99aa46fed3eff074bb4be7"

RPROVIDES:${PN} += "libblastrampoline.so.5()(64bit) \
libblastrampoline5 \
libblastrampoline5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
