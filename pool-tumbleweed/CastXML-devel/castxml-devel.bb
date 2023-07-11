SUMMARY = "C-family Abstract Syntax Tree XML Output"
DESCRIPTION = "CastXML is a C-family abstract syntax tree XML output tool."
LICENSE = "Apache-2.0"

PV = "0.6.1"

RPM_NAME = "CastXML-devel-0.6.1-1.2.aarch64.rpm"
RPM_HASH = "b6355474e333984d5ddd20689772af5104ed4bbc5d03d5eea8cf85f7d8171e1c3b374a82653ea6e4c791ca15c6aebeecd92721cc5faf58c98856835b8af58997"

RPROVIDES:${PN} += "CastXML-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libclang-cpp.so.16 \
libstdc++.so.6"

inherit rpm
