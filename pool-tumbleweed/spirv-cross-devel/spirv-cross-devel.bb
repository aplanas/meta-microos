SUMMARY = "Development headers for the SPIRV-Cross library"
DESCRIPTION = "SPIRV-Cross is a tool and library designed for parsing and \
converting SPIR-V to other shader languages."
LICENSE = "Apache-2.0 | MIT"

PV = "1.3.261.0"

RPM_NAME = "spirv-cross-devel-1.3.261.0-1.1.aarch64.rpm"
RPM_HASH = "88d221ae824073babd175e0695d7ed6cdbe99694bca819f8707f7fd9e2ff709b1cd55642255573389d49ddbaf0b23a155abd39ba591e06d0c7d9f0b093642b66"

RPROVIDES:${PN} += "libspirv-cross-c-shared-devel \
pkgconfig-spirv-cross-c \
pkgconfig-spirv-cross-c-shared \
spirv-cross-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspirv-cross-c-shared0"

inherit rpm
