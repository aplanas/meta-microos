SUMMARY = "SPIR-V tool component library"
DESCRIPTION = "The SPIR-V Tool library contains all of the implementation details \
driving the SPIR-V assembler, binary module parser, disassembler and \
validator, and is used in the standalone tools whilst also enabling \
integration into other code bases directly."
LICENSE = "Apache-2.0"

PV = "2023.3~rc1"

RPM_NAME = "libSPIRV-Tools-2023_3_rc1-2023.3~rc1-1.1.aarch64.rpm"
RPM_HASH = "34c04ce93bfb3e26edb5a400473fc6624960dd1f3601bcac31bddca9f3c28ab3cabd1d6979e14bd79a4289d6c910076c0eee0a03331d07b9d0aeb0ff2fd2b944"

RPROVIDES:${PN} += "libSPIRV-Tools-2023.3~rc1.so()(64bit) \
libSPIRV-Tools-2023_3_rc1 \
libSPIRV-Tools-2023_3_rc1(aarch-64) \
libSPIRV-Tools-diff-2023.3~rc1.so()(64bit) \
libSPIRV-Tools-link-2023.3~rc1.so()(64bit) \
libSPIRV-Tools-lint-2023.3~rc1.so()(64bit) \
libSPIRV-Tools-opt-2023.3~rc1.so()(64bit) \
libSPIRV-Tools-reduce-2023.3~rc1.so()(64bit) \
libSPIRV-Tools-shared-2023.3~rc1.so()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
