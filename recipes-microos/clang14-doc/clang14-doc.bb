SUMMARY = "Documentation for Clang"
DESCRIPTION = "This package contains documentation for the Clang compiler."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "clang14-doc-14.0.6-9.1.noarch.rpm"
RPM_HASH = "c5f0cde5cf8a119c7f5ba8c3e1f5a2ff7a012c4d5ab1b77b8449dd5dece4d6f5ab90c432322c1b59ee77d41e4250e283236bca9ae4914443be0f672a2e729bbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clang-doc-provider \
clang14-doc"
RDEPENDS:${PN} += ""

inherit rpm
