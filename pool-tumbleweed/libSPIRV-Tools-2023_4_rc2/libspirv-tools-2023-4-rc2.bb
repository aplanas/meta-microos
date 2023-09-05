SUMMARY = "SPIR-V tool component library"
DESCRIPTION = "The SPIR-V Tool library contains all of the implementation details \
driving the SPIR-V assembler, binary module parser, disassembler and \
validator, and is used in the standalone tools whilst also enabling \
integration into other code bases directly."
LICENSE = "Apache-2.0"

PV = "2023.4~rc2"

RPM_NAME = "libSPIRV-Tools-2023_4_rc2-2023.4~rc2-1.1.aarch64.rpm"
RPM_HASH = "1d625c4e1c256bb57ed75630d746d47a67ad4b99c85fd6c8ef42c958464b6e6dbca6d20c3b3bdb62a40a8010569725c262e08ea930a0762a44d015261f826bdb"

RPROVIDES:${PN} += "libSPIRV-Tools-2023-4-rc2 \
libSPIRV-Tools-2023.4~rc2.so \
libSPIRV-Tools-diff-2023.4~rc2.so \
libSPIRV-Tools-link-2023.4~rc2.so \
libSPIRV-Tools-lint-2023.4~rc2.so \
libSPIRV-Tools-opt-2023.4~rc2.so \
libSPIRV-Tools-reduce-2023.4~rc2.so \
libSPIRV-Tools-shared-2023.4~rc2.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
