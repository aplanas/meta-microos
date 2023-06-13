SUMMARY = "C-family Abstract Syntax Tree XML Output"
DESCRIPTION = "CastXML is a C-family abstract syntax tree XML output tool."
LICENSE = "Apache-2.0"

PV = "0.6.1"

RPM_NAME = "CastXML-devel-0.6.1-1.1.aarch64.rpm"
RPM_HASH = "e9e10f441bab72dda93ca0d629a5cc56d7815ddb197e2b911905645038716d898df0fb6521d164b811a22311b828436396322a481824977e07158cadaacbc03b"

RPROVIDES:${PN} += "CastXML-devel \
CastXML-devel(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.16()(64bit) \
libLLVM.so.16(LLVM_16)(64bit) \
libc.so.6()(64bit) \
libclang-cpp.so.16()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
