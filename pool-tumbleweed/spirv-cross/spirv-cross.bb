SUMMARY = "Tool and library for SPIR-V reflection and disassembly"
DESCRIPTION = "SPIRV-Cross is a tool and library designed for parsing and \
converting SPIR-V to other shader languages. \
 \
Features: \
  * Conversion of SPIR-V to GLSL, MSL or HLSL \
  * Conversion of SPIR-V to a JSON reflection format \
  * Reflection API to simplify the creation of Vulkan pipeline \
    layouts \
  * Reflection API to modify and tweak OpDecorations \
  * Support for 'all' of vertex, fragment, tessellation, geometry \
    and compute shaders."
LICENSE = "Apache-2.0 | MIT"

PV = "1.3.243.0"

RPM_NAME = "spirv-cross-1.3.243.0-1.1.aarch64.rpm"
RPM_HASH = "5c097b3a7fa6737f6ff87e5faeacd9e89f094f3df789243166eb87521c566e300bbd59cd306b24c81d7de901eda5cc030cf1f07ab7cf3859a9e79cb0275546c0"

RPROVIDES:${PN} += "spirv-cross \
spirv-cross(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
