SUMMARY = "The GNU Compiler Collection JIT library"
DESCRIPTION = "Support for embedding GCC inside programs and libraries"
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "libgccjit0-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "4578bc9b9cb6e1955d11a2633a313d0ad13ac4f18ab5c989481ee0d7dc415443f0edf4aa2a4cb8fce51060f69a18a954cca2d01a1d0d170fe87dff2848db60f8"

RPROVIDES:${PN} += "libgccjit.so.0 \
libgccjit0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gcc13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
