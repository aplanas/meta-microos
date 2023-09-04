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

PV = "1.3.261.0"

RPM_NAME = "spirv-cross-1.3.261.0-1.1.aarch64.rpm"
RPM_HASH = "ed227eadae9093388a60ba1e7486e1aac469767c71984f520bf12ad147e67798ec5d2503eb5d513f109fd92485c76b16f3bc18b7a33b6e6245d690b8e9df77d9"

RPROVIDES:${PN} += "spirv-cross"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
