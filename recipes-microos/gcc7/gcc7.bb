SUMMARY = "The GNU C Compiler and Support Files"
DESCRIPTION = "Core package for the GNU Compiler Collection, including the C language \
frontend. \
 \
Language frontends other than C are split to different sub-packages, \
namely gcc-ada, gcc-c++, gcc-fortran, gcc-obj, gcc-obj-c++ and gcc-go."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "928d397f69ebe8f2aea6b59546b9bc541d9d2d6540908daa9a7f48a8741878c1dd54cd27695a2e2497adcd932559bd37f1576524adb514c209025b25c956c54b"

RPROVIDES:${PN} += "gcc7 gcc7(aarch-64) liblto_plugin.so.0()(64bit)"
RDEPENDS:${PN} += "binutils cpp7 glibc-devel libasan4 libatomic1 libc.so.6(GLIBC_2.34)(64bit) libgcc_s1 libgmp.so.10()(64bit) libgomp1 libisl.so.23()(64bit) libitm1 liblsan0 libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libtsan0 libubsan0 libz.so.1()(64bit)"

inherit rpm
