SUMMARY = "CLANG frontend for LLVM (devel package)"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
(development files)"
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "clang11-devel-11.0.1-12.1.aarch64.rpm"
RPM_HASH = "4323cd153996f103c141573e1d1f141f3ec21ead2c1b398ea0498db0375c47b627e9138a25433af5764db30a5f82124f1f0aa741fb4bade58c89b573bdae8e1a"

RPROVIDES:${PN} += "clang11-devel clang11-devel(aarch-64) cmake(Clang)"
RDEPENDS:${PN} += "/sbin/ldconfig clang-tools clang11 llvm11-devel"

inherit rpm
