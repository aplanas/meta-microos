SUMMARY = "Documentation for LLVM"
DESCRIPTION = "This package contains documentation for the LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.6"

RPM_NAME = "llvm16-doc-16.0.6-1.1.noarch.rpm"
RPM_HASH = "264e5787cf4ad8e236a38b4e9174fa75a19303bd3ec4eea1f8e46acbc2541f3cbd37786523221a9e393e3f561a2f20f45c18dfca45b1e1b7b3c2bce94a7244f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-doc-provider \
llvm16-doc"

RDEPENDS:${PN} += "llvm16"

inherit rpm
