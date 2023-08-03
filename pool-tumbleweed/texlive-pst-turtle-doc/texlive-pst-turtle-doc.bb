SUMMARY = "Documentation for texlive-pst-turtle"
DESCRIPTION = "This package includes the documentation for texlive-pst-turtle"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn52261"

RPM_NAME = "texlive-pst-turtle-doc-2023.209.0.0.02svn52261-54.1.noarch.rpm"
RPM_HASH = "84bd110ab0e6b4193fbed52c6a50ce865f83996ca389487a1756a3be99dbffcca7ea70d139a14f131aee513304a0d12be9a974acb4fa16d0abe8faf31cf8243c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-turtle-doc"

RDEPENDS:${PN} += ""

inherit rpm
