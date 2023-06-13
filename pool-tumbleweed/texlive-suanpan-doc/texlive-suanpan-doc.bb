SUMMARY = "Documentation for texlive-suanpan"
DESCRIPTION = "This package includes the documentation for texlive-suanpan"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-suanpan-doc-2023.201.svn15878-57.1.noarch.rpm"
RPM_HASH = "45ba3b0c92fb4b9b25bf3571007319b32bceed185a852f6e9bd6d0dfa36d2e48929c92a9661f9be64598848b2b5dc5dcab2582e9a17bfa12d3572012723166d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-suanpan-doc"

RDEPENDS:${PN} += ""

inherit rpm
