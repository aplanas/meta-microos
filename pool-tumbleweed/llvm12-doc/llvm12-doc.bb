SUMMARY = "Documentation for LLVM"
DESCRIPTION = "This package contains documentation for the LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "llvm12-doc-12.0.1-12.1.noarch.rpm"
RPM_HASH = "c3ff5648f040887149d6d0d8ba0a939695de3a19ac00623952bd14663bc1a8809a25e51cae8cd7264d22596dbfd82818b5b8f1453ed7e6b90b6f2760fe8f0068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-doc-provider \
llvm12-doc"

RDEPENDS:${PN} += "llvm12"

inherit rpm
