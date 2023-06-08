SUMMARY = "Documentation for Clang"
DESCRIPTION = "This package contains documentation for the Clang compiler."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "clang11-doc-11.0.1-12.1.noarch.rpm"
RPM_HASH = "2ca9da9d52f5f1a0c258bcafedd0183c87778561fb857c2f29ef659ebebad9ae13cc87b917c063827610bc6b1a927a520edaeaf1f3164924c0b4ffbd06dd6d99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clang-doc-provider clang11-doc"
RDEPENDS:${PN} += ""

inherit rpm
