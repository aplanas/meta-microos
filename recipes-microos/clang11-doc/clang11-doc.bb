SUMMARY = "Documentation for Clang"
DESCRIPTION = "This package contains documentation for the Clang compiler."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "clang11-doc-11.0.1-13.1.noarch.rpm"
RPM_HASH = "1e1381813262bcc700cf584cfc22c5692e2f7ab223a115fce4e8522d7e28147d6bd0f4df9b9876806a1c8e4174245ac148c43959e0a1769b4b26a5a4ffa3197d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clang-doc-provider clang11-doc"
RDEPENDS:${PN} += ""

inherit rpm
