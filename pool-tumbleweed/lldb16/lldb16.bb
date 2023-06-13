SUMMARY = "Software debugger built using LLVM libraries"
DESCRIPTION = "LLDB is a next generation, high-performance debugger. It is built as a set \
of reusable components which highly leverage existing libraries in the \
larger LLVM Project, such as the Clang expression parser and LLVM \
disassembler."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "lldb16-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "fd914c129e958e727fc553a38281592ae12278a86e98d9dc1d474b20863cf5477762c3cddf15367663ffab3907fa82958fb3ad967e1e407289e1ad609af10a85"

RPROVIDES:${PN} += "lldb16 \
lldb16(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.16()(64bit) \
libLLVM.so.16(LLVM_16)(64bit) \
libc.so.6()(64bit) \
libclang-cpp.so.16()(64bit) \
libgcc_s.so.1()(64bit) \
liblldb.so.16()(64bit) \
liblldb.so.16(LLVM_16)(64bit) \
liblzma.so.5()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
update-alternatives"

inherit rpm
