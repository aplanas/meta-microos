SUMMARY = "Documentation for LLVM"
DESCRIPTION = "This package contains documentation for the LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "llvm11-doc-11.0.1-13.1.noarch.rpm"
RPM_HASH = "849f8e185b7b4ef4ae47e37eb14fb57c3abb2b9f9e00459ff316f4b46601f7f5c2e7f476283b4c7f7f36372dce2913744de047074b4fbcc48bf1deda03dbd0d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-doc-provider \
llvm11-doc"

RDEPENDS:${PN} += "llvm11"

inherit rpm
