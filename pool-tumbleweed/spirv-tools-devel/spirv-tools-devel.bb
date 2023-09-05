SUMMARY = "Development headers for the SPIR-V tool library"
DESCRIPTION = "The SPIR-V Tool library contains all of the implementation details \
driving the SPIR-V assembler, binary module parser, disassembler and \
validator, and is used in the standalone tools whilst also enabling \
integration into other code bases directly."
LICENSE = "Apache-2.0"

PV = "2023.4~rc2"

RPM_NAME = "spirv-tools-devel-2023.4~rc2-1.1.aarch64.rpm"
RPM_HASH = "7f30e9b3879562414883ad44ebddc9e86a66be3af2cff3fd7c5eb2a39710d542faea1a251202c3ec1e6887dd2695b8607f426533df0ccfbb617efe393594e3f9"

RPROVIDES:${PN} += "cmake-SPIRV-Tools \
cmake-SPIRV-Tools-diff \
cmake-SPIRV-Tools-link \
cmake-SPIRV-Tools-lint \
cmake-SPIRV-Tools-opt \
cmake-SPIRV-Tools-reduce \
cmake-SPIRV-Tools-tools \
pkgconfig-SPIRV-Tools \
pkgconfig-SPIRV-Tools-shared \
spirv-tools-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSPIRV-Tools-2023-4-rc2"

inherit rpm
