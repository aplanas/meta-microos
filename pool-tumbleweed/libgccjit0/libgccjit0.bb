SUMMARY = "The GNU Compiler Collection JIT library"
DESCRIPTION = "Support for embedding GCC inside programs and libraries"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "libgccjit0-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "5fb44db6d42f6ca8e82147d2e3a350db4c10d6891395267044e78d3017e9169862e26c5557c36153fe556f9956e9d86f1481b634e46f690d5dfc0740c256e66a"

RPROVIDES:${PN} += "libgccjit.so.0()(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_0)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_1)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_10)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_11)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_12)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_13)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_14)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_15)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_16)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_17)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_18)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_19)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_2)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_20)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_21)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_22)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_23)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_24)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_3)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_4)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_5)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_6)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_7)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_8)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_9)(64bit) \
libgccjit0 \
libgccjit0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
gcc13 \
libc.so.6(GLIBC_2.36)(64bit) \
libgmp.so.10()(64bit) \
libisl.so.23()(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
