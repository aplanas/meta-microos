SUMMARY = "Documentation for texlive-heros-otf"
DESCRIPTION = "This package includes the documentation for texlive-heros-otf"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn64695"

RPM_NAME = "texlive-heros-otf-doc-2023.209.0.0.01svn64695-54.2.noarch.rpm"
RPM_HASH = "299b2b21510f454d2737489e35f397c15a48afe5a67f349014a97b553261d3d5c7d906d8012558a5dfc52facfc789bc8399ba7affc19fb1bbf1950bdfbd150cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-heros-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
