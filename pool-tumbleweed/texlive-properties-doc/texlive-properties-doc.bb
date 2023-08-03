SUMMARY = "Documentation for texlive-properties"
DESCRIPTION = "This package includes the documentation for texlive-properties"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-properties-doc-2023.209.0.0.2svn15878-53.1.noarch.rpm"
RPM_HASH = "4c61b89cb817b5e95bc6a3d5bdb1eb5b3157b0dd33bf8bc80f7d79c450284bee3d6216149ee43c1098a25b45883e755d0bbadf1b22cf71e886dda4d6333273fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-properties-doc"

RDEPENDS:${PN} += ""

inherit rpm
