SUMMARY = "LLVM/SPIR-V Bi-Directional Translator library"
DESCRIPTION = "The LLVM/SPIR-V Bi-Directional Translator, a library and tool for translation \
between LLVM IR and SPIR-V."
LICENSE = "BSD-3-Clause"

PV = "16.0.0"

RPM_NAME = "libLLVMSPIRVLib16-16.0.0-1.2.aarch64.rpm"
RPM_HASH = "fc05481ec2780494a9097fa3108cbb55a23ed80d3b35a683d9e24375158b4c821e8053a78fceb899b9137a33a41fe6d2f8dbacbbbb38da4f2700da79179b89ef"

RPROVIDES:${PN} += "libLLVMSPIRVLib.so.16 \
libLLVMSPIRVLib16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
