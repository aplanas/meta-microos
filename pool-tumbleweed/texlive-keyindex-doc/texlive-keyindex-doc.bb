SUMMARY = "Documentation for texlive-keyindex"
DESCRIPTION = "This package includes the documentation for texlive-keyindex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn50828"

RPM_NAME = "texlive-keyindex-doc-2023.201.1.0svn50828-55.1.noarch.rpm"
RPM_HASH = "687f45e67a77010e3419ad63bd582880726d11789117131b576393f2977e16e747648ef0e14f3341c26736d59e02f0dddf57ee43e067c155229bdd27f57c2596"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-keyindex-doc"
RDEPENDS:${PN} += ""

inherit rpm
