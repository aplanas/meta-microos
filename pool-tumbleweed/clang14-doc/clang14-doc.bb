SUMMARY = "Documentation for Clang"
DESCRIPTION = "This package contains documentation for the Clang compiler."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "clang14-doc-14.0.6-10.1.noarch.rpm"
RPM_HASH = "36a36f82a92da0e62bf51ab38b2e9061e4541a3b0df54a582a195901412a4c0ed2e97b915617d163826fcedcd80f26d1a0a98ba94214badc1b211fc0ee6fd671"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clang-doc-provider \
clang14-doc"

RDEPENDS:${PN} += ""

inherit rpm
