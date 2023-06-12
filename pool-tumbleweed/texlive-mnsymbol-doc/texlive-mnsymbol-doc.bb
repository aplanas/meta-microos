SUMMARY = "Documentation for texlive-mnsymbol"
DESCRIPTION = "This package includes the documentation for texlive-mnsymbol"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.4svn18651"

RPM_NAME = "texlive-mnsymbol-doc-2023.201.1.4svn18651-54.1.noarch.rpm"
RPM_HASH = "b80b5a8e9a2e54ab27dc36f5d2560db4daeec39e0768734ecc8a28c91cbce77ba3ccefd0a7151095eed491538d33f97b82962d3862b2b6ce2d2b07c0e101e869"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mnsymbol-doc"
RDEPENDS:${PN} += ""

inherit rpm
