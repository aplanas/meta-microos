SUMMARY = "Documentation for texlive-keycommand"
DESCRIPTION = "This package includes the documentation for texlive-keycommand"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1415svn18042"

RPM_NAME = "texlive-keycommand-doc-2023.201.3.1415svn18042-55.1.noarch.rpm"
RPM_HASH = "380de8ec417a479526ed1b2df6e0aad7b436a8878e01bbbbc2160731a396b87947459559963a3857a5b49045e4a80a024fbdee955d844c1b8a3c3303c5fbd58b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-keycommand-doc"

RDEPENDS:${PN} += ""

inherit rpm
