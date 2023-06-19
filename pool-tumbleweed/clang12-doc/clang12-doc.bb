SUMMARY = "Documentation for Clang"
DESCRIPTION = "This package contains documentation for the Clang compiler."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "clang12-doc-12.0.1-12.1.noarch.rpm"
RPM_HASH = "b885344c6325e2814f9a4cc890284dbeb4f22092bdf1b502443e2c9d675f0c9e3989bb0d03fa1adca7163498badf6a607e6a82fc88e700d6113f17ba96af504e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clang-doc-provider \
clang12-doc"

RDEPENDS:${PN} += ""

inherit rpm
