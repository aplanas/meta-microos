SUMMARY = "The GNU Compiler Collection JIT library"
DESCRIPTION = "Support for embedding GCC inside programs and libraries"
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "libgccjit0-gcc12-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "f06f0110c9c56410aa3ba0304caf81a8c9caecb69d53fdfcba1637303a6486762e869279f441371b6b6000e38d665e9aa617528ceebfe7537a6c81ad60b1d8a5"

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
