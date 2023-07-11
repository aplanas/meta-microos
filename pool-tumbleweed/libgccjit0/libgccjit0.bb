SUMMARY = "The GNU Compiler Collection JIT library"
DESCRIPTION = "Support for embedding GCC inside programs and libraries"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "libgccjit0-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "91e531a664d13130b382cfcd7e6f143f805dcf8c1dfa36e8d966550140cacf7af90b783a11cc53cb6d193fefe7474d156300e3c217731ff22cc7ad74b389927f"

RPROVIDES:${PN} += "libgccjit.so.0 \
libgccjit0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gcc13 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
