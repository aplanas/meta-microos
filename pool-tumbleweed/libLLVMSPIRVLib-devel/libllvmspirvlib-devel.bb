SUMMARY = "Development files for LLVM/SPIR-V Bi-Directional Translator library"
DESCRIPTION = "The LLVM/SPIR-V Bi-Directional Translator, a library and tool for translation \
between LLVM IR and SPIR-V. \
 \
This package provides headers and libraries required for building software using \
the LLVM/SPIR-V Bi-Directional Translator library."
LICENSE = "BSD-3-Clause"

PV = "16.0.0"

RPM_NAME = "libLLVMSPIRVLib-devel-16.0.0-1.2.aarch64.rpm"
RPM_HASH = "808b72cc7d7b8dfe4aa2f0c8c7900c771335161c534820748b4449960666b762e766df1dc1ed7c8e0ff9810acea380e9cf7586cafa656dc58a44a8ea93e80952"

RPROVIDES:${PN} += "libLLVMSPIRVLib-devel \
pkgconfig-LLVMSPIRVLib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libLLVMSPIRVLib.so.16 \
libLLVMSPIRVLib16 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
