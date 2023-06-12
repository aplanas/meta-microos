SUMMARY = "Documentation for texlive-datetime2-en-fulltext"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-en-fulltext"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn36705"

RPM_NAME = "texlive-datetime2-en-fulltext-doc-2023.201.1.0svn36705-52.1.noarch.rpm"
RPM_HASH = "2f8ed246b1f216dfcabbd5928eeb5d788a5ce8029fac08494f95eafe39dca09df848f9acc726285266ae9253558f8c3178d0509ee90a6efc827e065549ee0084"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-en-fulltext-doc"
RDEPENDS:${PN} += ""

inherit rpm
