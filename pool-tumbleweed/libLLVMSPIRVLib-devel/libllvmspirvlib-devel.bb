SUMMARY = "Development files for LLVM/SPIR-V Bi-Directional Translator library"
DESCRIPTION = "The LLVM/SPIR-V Bi-Directional Translator, a library and tool for translation \
between LLVM IR and SPIR-V. \
 \
This package provides headers and libraries required for building software using \
the LLVM/SPIR-V Bi-Directional Translator library."
LICENSE = "BSD-3-Clause"

PV = "16.0.0"

RPM_NAME = "libLLVMSPIRVLib-devel-16.0.0-1.1.aarch64.rpm"
RPM_HASH = "a4412c45a4801f29afc287b4e9d9389d071445599f288053fb5613a6772af2d32113bdb53b8cc21a2809fffdff77d7d66335102994b15d735a3301fd32071ce5"

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
