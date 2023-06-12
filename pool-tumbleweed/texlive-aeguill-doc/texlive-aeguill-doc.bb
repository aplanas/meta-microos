SUMMARY = "Documentation for texlive-aeguill"
DESCRIPTION = "This package includes the documentation for texlive-aeguill"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-aeguill-doc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "8ca545f9dc1a125c83b16fc39d44494796615901dd3068a0d64a38d018ccd3f790a47f91fb4e8e8e9768399917c79860e10da0f2e1438da1d8fbd90dbd7c2b3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aeguill-doc"
RDEPENDS:${PN} += ""

inherit rpm
