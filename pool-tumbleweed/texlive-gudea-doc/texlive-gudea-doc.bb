SUMMARY = "Documentation for texlive-gudea"
DESCRIPTION = "This package includes the documentation for texlive-gudea"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.0.1svn57359"

RPM_NAME = "texlive-gudea-doc-2023.209.0.0.0.1svn57359-54.2.noarch.rpm"
RPM_HASH = "860498df6e51ffabcc0ed00df81e3d1e80deb00a3a4985151f441f8a1991a17f738753876578bea57f9fed8f42264b771a34bdd1786a45e1eca16cd6130cd1b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gudea-doc"

RDEPENDS:${PN} += ""

inherit rpm
