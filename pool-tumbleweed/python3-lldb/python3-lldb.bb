SUMMARY = "Python bindings for liblldb"
DESCRIPTION = "This package contains the Python bindings to clang (C language) frontend for LLVM. \
 \
This package is a dummy package that depends on the version of \
python3-lldb that openSUSE currently supports.  Packages that \
don't require a specific LLDB version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "16.0.6"

RPM_NAME = "python3-lldb-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "8112b47a3e795f4b7d9c2b409f34ea61e7e4b88e11dd5862a3ad1d28c95c1beaa8f66c8f94c78348a97aa18c664438b929b3b43441c05202d5892a7670845ef1"

RPROVIDES:${PN} += "python3-lldb"

RDEPENDS:${PN} += "python3-lldb16"

inherit rpm
