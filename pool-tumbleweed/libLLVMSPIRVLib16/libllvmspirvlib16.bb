SUMMARY = "LLVM/SPIR-V Bi-Directional Translator library"
DESCRIPTION = "The LLVM/SPIR-V Bi-Directional Translator, a library and tool for translation \
between LLVM IR and SPIR-V."
LICENSE = "BSD-3-Clause"

PV = "16.0.0"

RPM_NAME = "libLLVMSPIRVLib16-16.0.0-1.1.aarch64.rpm"
RPM_HASH = "44260ed471027c5895c2f21e8ebf0311e6dfe4a64d6742f64da247bf0b2fede66935d6eee8bbbda8f35b4a6125e0cd2fb2fff9d00468dc930516fc0cef73c1fb"

RPROVIDES:${PN} += "libLLVMSPIRVLib.so.16 \
libLLVMSPIRVLib16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
