SUMMARY = "Python bindings for liblldb"
DESCRIPTION = "This package contains the Python bindings to clang (C language) frontend for LLVM. \
 \
This package is a dummy package that depends on the version of \
python3-lldb that openSUSE currently supports.  Packages that \
don't require a specific LLDB version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "16.0.4"

RPM_NAME = "python3-lldb-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "c99dd756c4932bfc3749f661582e0cab24bd4b35a870e572c4f410e6ca2b9bcbf456864b24bd6182729a4cbee518243d23cee58a711f6df11336a7766e08131f"

RPROVIDES:${PN} += "python3-lldb"

RDEPENDS:${PN} += "python3-lldb16"

inherit rpm
