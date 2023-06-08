SUMMARY = "The GNU C Compiler and Support Files"
DESCRIPTION = "Core package for the GNU Compiler Collection, including the C language \
frontend. \
 \
Language frontends other than C are split to different sub-packages, \
namely gcc-ada, gcc-c++, gcc-fortran, gcc-obj, gcc-obj-c++ and gcc-go."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "4de8cf26c7ce42b720d5894309d9a0b34d95528cf5387ffe8ff8fac7b8e746ff6c11f97238b6d13909bf9bafaa7ced638c67b5a96609ddccc03756f312c75f8a"

RPROVIDES:${PN} += "gcc12 gcc12(aarch-64) liblto_plugin.so()(64bit)"
RDEPENDS:${PN} += "binutils cpp12 glibc-devel libasan8 libatomic1 libc.so.6(GLIBC_2.36)(64bit) libgcc_s1 libgmp.so.10()(64bit) libgomp1 libhwasan0 libisl.so.23()(64bit) libitm1 liblsan0 libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libtsan2 libubsan1 libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
