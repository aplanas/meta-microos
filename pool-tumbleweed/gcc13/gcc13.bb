SUMMARY = "The GNU C Compiler and Support Files"
DESCRIPTION = "Core package for the GNU Compiler Collection, including the C language \
frontend. \
 \
Language frontends other than C are split to different sub-packages, \
namely gcc-ada, gcc-c++, gcc-fortran, gcc-obj, gcc-obj-c++, gcc-go, \
gcc-rust and gcc-m2."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "gcc13-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "99e397992c57299034064513b3194b5f378669596f6d108b14abc19244c4276e38f6701ae49795fabb3bd9dfc5ebe7aac1a04ddbe54aac0bff4ea811f47b15d7"

RPROVIDES:${PN} += "gcc13 \
liblto-plugin.so"

RDEPENDS:${PN} += "binutils \
cpp13 \
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
