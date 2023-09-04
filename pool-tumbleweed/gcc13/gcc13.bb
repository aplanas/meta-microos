SUMMARY = "The GNU C Compiler and Support Files"
DESCRIPTION = "Core package for the GNU Compiler Collection, including the C language \
frontend. \
 \
Language frontends other than C are split to different sub-packages, \
namely gcc-ada, gcc-c++, gcc-fortran, gcc-obj, gcc-obj-c++, gcc-go, \
gcc-rust and gcc-m2."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "gcc13-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "bfd7bfcac21ee26f220dd54b75424582beb88dd073ce8a99a3a91f21f64727661bf01495587b4dfa8e8ca7d694ff079a2cf6f93652b13cf19838553b7cd8923b"

RPROVIDES:${PN} += "gcc13 \
liblto-plugin.so"

RDEPENDS:${PN} += "binutils \
cpp13 \
glibc-devel \
ld-linux-aarch64.so.1 \
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
