SUMMARY = "The GNU C Compiler and Support Files"
DESCRIPTION = "Core package for the GNU Compiler Collection, including the C language \
frontend. \
 \
Language frontends other than C are split to different sub-packages, \
namely gcc-ada, gcc-c++, gcc-fortran, gcc-obj, gcc-obj-c++ and gcc-go."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "gcc12-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "e8d3b49d158b845445c59d7b8c1c4d56c2764f555b94c588e6841b187e8408b5a05cf5c79a5173e859e160149213b1f9b8b39ec7894678826b9042a16c2012b3"

RPROVIDES:${PN} += "gcc12 \
liblto-plugin.so"

RDEPENDS:${PN} += "binutils \
cpp12 \
glibc-devel \
libasan8 \
libatomic1 \
libc.so.6 \
libgcc-s1 \
libgmp.so.10 \
libgomp1 \
libhwasan0 \
libisl.so.23 \
libitm1 \
liblsan0 \
libmpc.so.3 \
libmpfr.so.6 \
libtsan2 \
libubsan1 \
libz.so.1 \
libzstd.so.1"

inherit rpm
