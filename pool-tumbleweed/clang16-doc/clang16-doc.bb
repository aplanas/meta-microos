SUMMARY = "Documentation for Clang"
DESCRIPTION = "This package contains documentation for the Clang compiler."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "clang16-doc-16.0.4-1.1.noarch.rpm"
RPM_HASH = "5c721163533e5dd760366ff3c8070a35780270fe68e0bb1c4b2b55abdab48cad9c966891c6a04f0385eae8d90bb631301e1f4078008b7e1b52e24d6d6da9396c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clang-doc-provider \
clang16-doc"
RDEPENDS:${PN} += ""

inherit rpm
