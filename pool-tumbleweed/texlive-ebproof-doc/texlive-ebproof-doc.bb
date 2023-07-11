SUMMARY = "Documentation for texlive-ebproof"
DESCRIPTION = "This package includes the documentation for texlive-ebproof"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.1svn57544"

RPM_NAME = "texlive-ebproof-doc-2023.201.2.1.1svn57544-53.2.noarch.rpm"
RPM_HASH = "c2fbba7fdb9db07d00e1900481fa5fbbbabbbb2de9d69ffca1db49275dfde2994211709dc5bbed607b058f9018c99d60eaf345e0e56f54b1e8400d2ae0f61b2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebproof-doc"

RDEPENDS:${PN} += ""

inherit rpm
