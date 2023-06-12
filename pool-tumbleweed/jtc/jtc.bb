SUMMARY = "JSON processing utility"
DESCRIPTION = "jtc stand for: JSON transformational chains (used to be JSON test console). \
 \
jtc offers a powerful way to select one or multiple elements from a source JSON \
and apply various actions on the selected elements at once (wrap selected \
elements into a new JSON, filter in/out, sort elements, update elements, insert \
new elements, remove, copy, move, compare, transform, swap around and many other \
operations)."
LICENSE = "MIT"

PV = "1.76d"

RPM_NAME = "jtc-1.76d-1.13.aarch64.rpm"
RPM_HASH = "f04820a55dde5660f75f8c6b44177d2c047f8a1b58ea3a3aad72a3747828e57a835950eeedd39204d6762a66b98e5995b1ed41d9eb878d02515da19e9e4ee781"

RPROVIDES:${PN} += "jtc \
jtc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
