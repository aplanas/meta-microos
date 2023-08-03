SUMMARY = "Documentation for texlive-ebproof"
DESCRIPTION = "This package includes the documentation for texlive-ebproof"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.1svn57544"

RPM_NAME = "texlive-ebproof-doc-2023.209.2.1.1svn57544-54.1.noarch.rpm"
RPM_HASH = "b25b0555e98b2d9022557d1e95e87e205d0bed6f6e500234225897caa08fafcb28528a474bab487b47343bf591520393c96ad5c22a3187b25d476e271478d3f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebproof-doc"

RDEPENDS:${PN} += ""

inherit rpm
