SUMMARY = "The GNU C Compiler and Support Files"
DESCRIPTION = "Core package for the GNU Compiler Collection, including the C language \
frontend. \
 \
Language frontends other than C are split to different sub-packages, \
namely gcc-ada, gcc-c++, gcc-fortran, gcc-obj, gcc-obj-c++ and gcc-go."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "044a59efe981251a3d0a7cdc2f45a9832f3d0c0c88221bce1f69fd4966bb52b587059b33dcb9c4be073ccc1fff1fca05cbe569b1732d250a042f80d7d7e58cf6"

RPROVIDES:${PN} += "gcc11 gcc11(aarch-64) liblto_plugin.so()(64bit)"
RDEPENDS:${PN} += "binutils cpp11 glibc-devel libasan6 libatomic1 libc.so.6(GLIBC_2.34)(64bit) libgcc_s1 libgmp.so.10()(64bit) libgomp1 libhwasan0 libisl.so.23()(64bit) libitm1 liblsan0 libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libtsan0 libubsan1 libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
