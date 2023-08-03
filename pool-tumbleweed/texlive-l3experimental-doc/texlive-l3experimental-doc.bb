SUMMARY = "Documentation for texlive-l3experimental"
DESCRIPTION = "This package includes the documentation for texlive-l3experimental"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65621"

RPM_NAME = "texlive-l3experimental-doc-2023.209.svn65621-56.1.noarch.rpm"
RPM_HASH = "f5167415f914c33b55c3b6806b710c82b05d29ccc26cbc11fc19b3ef8faec80e343a0f0b2ed12310e1cf04ea33461ef9719d3282a0ccfe2be109d543bd671a9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l3experimental-doc"

RDEPENDS:${PN} += ""

inherit rpm
