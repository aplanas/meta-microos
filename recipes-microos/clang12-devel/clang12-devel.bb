SUMMARY = "CLANG frontend for LLVM (devel package)"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
(development files)"
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "clang12-devel-12.0.1-11.1.aarch64.rpm"
RPM_HASH = "9d50b0024102057486793b19eee2cd9e1538f0c15a9bc0cb562a4044a385e61292bbb4b34321d33bfb90d410a92a633ba78e928ff70ad2bfa61cc0e3a8f44696"

RPROVIDES:${PN} += "clang12-devel clang12-devel(aarch-64) cmake(Clang)"
RDEPENDS:${PN} += "/sbin/ldconfig clang-tools clang12 llvm12-devel"

inherit rpm
