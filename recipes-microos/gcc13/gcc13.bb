SUMMARY = "The GNU C Compiler and Support Files"
DESCRIPTION = "Core package for the GNU Compiler Collection, including the C language \
frontend. \
 \
Language frontends other than C are split to different sub-packages, \
namely gcc-ada, gcc-c++, gcc-fortran, gcc-obj, gcc-obj-c++, gcc-go, \
gcc-rust and gcc-m2."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "gcc13-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "a0aeb1d4d39e6e87a5e9755cf8d269e1560a329702ae5bd11c3434f130a7b38c08913f465f24be4f12bcbc3ddc77e38a164885326dfdb752b51cc3aed3fa0b2e"

RPROVIDES:${PN} += "gcc13 gcc13(aarch-64) liblto_plugin.so()(64bit)"
RDEPENDS:${PN} += "binutils cpp13 glibc-devel libasan8 libatomic1 libc.so.6(GLIBC_2.36)(64bit) libgcc_s1 libgmp.so.10()(64bit) libgomp1 libhwasan0 libisl.so.23()(64bit) libitm1 liblsan0 libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libtsan2 libubsan1 libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
