SUMMARY = "The GNU Compiler Collection JIT library"
DESCRIPTION = "Support for embedding GCC inside programs and libraries"
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "libgccjit0-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "c5b1cfe972f144bdcbb2324c01ad46987f77369a0632a2674d26af078cb8ef098c0e9bd1e720f1fc305cd05393c490f6783afdf33783813874d49780266280c3"

RPROVIDES:${PN} += "libgccjit.so.0 \
libgccjit0 \
libgccjit0-gcc12"

RDEPENDS:${PN} += "/sbin/ldconfig \
gcc12 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
