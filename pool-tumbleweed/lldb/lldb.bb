SUMMARY = "Software debugger built using LLVM libraries"
DESCRIPTION = "LLDB is a next generation, high-performance debugger. It is built as a set \
of reusable components which highly leverage existing libraries in the \
larger LLVM Project, such as the Clang expression parser and LLVM \
disassembler. \
 \
This package is a dummy package that depends on the version of \
lldb that openSUSE currently supports.  Packages that \
don't require a specific LLDB version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "16.0.6"

RPM_NAME = "lldb-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "6b15278ca3e07d9ea0378c25e3451e18c095153915729eaba24a484e9d6765a9ca04c45c8b67e83005e4f4ef11790530f0a2402b451dd8413d593e004e659dee"

RPROVIDES:${PN} += "lldb"

RDEPENDS:${PN} += "lldb16"

inherit rpm
