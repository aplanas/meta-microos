SUMMARY = "Documentation for texlive-idxcmds"
DESCRIPTION = "This package includes the documentation for texlive-idxcmds"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2csvn54554"

RPM_NAME = "texlive-idxcmds-doc-2023.209.0.0.2csvn54554-54.1.noarch.rpm"
RPM_HASH = "ed142330ede8d463253c416439ae5f68e6a506fc1993cf89bd282c107fcebaa295cafa8d5b81f421c2e63755dbe0aeb1bec024c4f023e18fba8c5095fa17d0ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-idxcmds-doc"

RDEPENDS:${PN} += ""

inherit rpm
