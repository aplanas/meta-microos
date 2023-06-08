SUMMARY = "CLANG frontend for LLVM (devel package)"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
(development files)"
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.2"

RPM_NAME = "clang16-devel-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "354c338fe6cd8a9543e3650c3f30ae795dd449e38d576c34c99d67f7fb9fa0e2cf78dc2fbe6283b5ef8d97eace9ddd3996991cdb2a1f9bf15f1eb4a8267b1aa6"

RPROVIDES:${PN} += "clang16-devel clang16-devel(aarch-64) cmake(Clang)"
RDEPENDS:${PN} += "/sbin/ldconfig clang-tools clang16 libclang-cpp16 libclang13 llvm16-devel"

inherit rpm
