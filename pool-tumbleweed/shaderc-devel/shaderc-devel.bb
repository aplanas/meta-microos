SUMMARY = "Header files for the shaderc library"
DESCRIPTION = "A compiler library for GLSL/HLSL to SPIR-V. \
 \
Shaderc wraps around core functionality in glslang and SPIRV-Tools"
LICENSE = "Apache-2.0"

PV = "2023.4"

RPM_NAME = "shaderc-devel-2023.4-1.1.aarch64.rpm"
RPM_HASH = "18e60ca496c2849122359a23f58df7595f33db6341794432d0c704e0e61549797ff93b551ef8e3b888271a60887160a0e78e2480fb13ca80f38ef83eaa5601ec"

RPROVIDES:${PN} += "pkgconfig-shaderc \
shaderc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libshaderc-shared1"

inherit rpm
