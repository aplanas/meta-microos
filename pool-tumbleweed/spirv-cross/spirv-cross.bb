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

RPM_NAME = "spirv-cross-1.3.243.0-1.2.aarch64.rpm"
RPM_HASH = "61963013da3b45fe64523bc5c7450ccda0c3f98544744d7ad9ff6abeea2cea9086f58a09f8f258f15a989bea193877bc1c62b29ef79923966c863e0792a96cc4"

RPROVIDES:${PN} += "spirv-cross"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
