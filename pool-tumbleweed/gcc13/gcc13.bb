SUMMARY = "The GNU C Compiler and Support Files"
DESCRIPTION = "Core package for the GNU Compiler Collection, including the C language \
frontend. \
 \
Language frontends other than C are split to different sub-packages, \
namely gcc-ada, gcc-c++, gcc-fortran, gcc-obj, gcc-obj-c++, gcc-go, \
gcc-rust and gcc-m2."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "gcc13-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "c7e501f583cb153d3bd53d35d54b8769d16197dcb1b1ad38bd74a16fc19f448eecf8f7e337e1890ab4b0542db09d68f407341b4365ccc686e8a9578b9e12ea83"

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
