SUMMARY = "Documentation for LLVM"
DESCRIPTION = "This package contains documentation for the LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-doc-15.0.7-3.1.noarch.rpm"
RPM_HASH = "7567293d34d30ceaa960efee1e0deb6693cfab017ea67a65aca3840d113b3d81d2daf93be1f8d1a8fb9020513360dbd69c623906a60648866433e422b6b245bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-doc-provider \
llvm15-doc"

RDEPENDS:${PN} += "llvm15"

inherit rpm
