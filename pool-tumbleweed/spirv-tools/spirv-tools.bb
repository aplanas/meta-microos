SUMMARY = "API and commands for processing SPIR-V modules"
DESCRIPTION = "The package includes an assembler, binary module parser, \
disassembler, and validator for SPIR-V."
LICENSE = "Apache-2.0"

PV = "2023.4~rc2"

RPM_NAME = "spirv-tools-2023.4~rc2-1.1.aarch64.rpm"
RPM_HASH = "505626b2af84f98f8c3e5f348913fe6884a8907eb74c379d6c75074667b4a9ff76cc4d9bb55758b0af1527e58a3ec226f448dfc0d123fb303d6ddddd69ffecbd"

RPROVIDES:${PN} += "spirv-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSPIRV-Tools-2023.4~rc2.so \
libSPIRV-Tools-link-2023.4~rc2.so \
libSPIRV-Tools-lint-2023.4~rc2.so \
libSPIRV-Tools-opt-2023.4~rc2.so \
libSPIRV-Tools-reduce-2023.4~rc2.so \
libc.so.6 \
libstdc++.so.6"

inherit rpm
