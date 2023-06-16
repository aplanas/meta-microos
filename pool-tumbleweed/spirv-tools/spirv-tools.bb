SUMMARY = "API and commands for processing SPIR-V modules"
DESCRIPTION = "The package includes an assembler, binary module parser, \
disassembler, and validator for SPIR-V."
LICENSE = "Apache-2.0"

PV = "2023.3~rc1"

RPM_NAME = "spirv-tools-2023.3~rc1-1.1.aarch64.rpm"
RPM_HASH = "92c7a0072db2e1a60cb541fedc3c7e8af4a631beb8bc4c47c5628b2a903d001e4ee817fe60b8996c37c86c9dfe97af35c47464714c18ef448c135d79c3d6871d"

RPROVIDES:${PN} += "spirv-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSPIRV-Tools-2023.3~rc1.so \
libSPIRV-Tools-link-2023.3~rc1.so \
libSPIRV-Tools-lint-2023.3~rc1.so \
libSPIRV-Tools-opt-2023.3~rc1.so \
libSPIRV-Tools-reduce-2023.3~rc1.so \
libc.so.6 \
libstdc++.so.6"

inherit rpm
