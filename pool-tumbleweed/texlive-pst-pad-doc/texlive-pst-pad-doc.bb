SUMMARY = "Documentation for texlive-pst-pad"
DESCRIPTION = "This package includes the documentation for texlive-pst-pad"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3bsvn15878"

RPM_NAME = "texlive-pst-pad-doc-2023.201.0.0.3bsvn15878-52.1.noarch.rpm"
RPM_HASH = "bcf7314fef85052f76d222a84c127d3748f13338f094b06669a04a984e78c58c2eed0624b0ec735b503cdb7b1f9659760161d7bf5660516b3cdb8bfb40ab4ea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pst-pad-doc:en;de) \
texlive-pst-pad-doc"

RDEPENDS:${PN} += ""

inherit rpm
