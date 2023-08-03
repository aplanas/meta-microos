SUMMARY = "Documentation for texlive-elbioimp"
DESCRIPTION = "This package includes the documentation for texlive-elbioimp"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn21758"

RPM_NAME = "texlive-elbioimp-doc-2023.209.1.2svn21758-54.1.noarch.rpm"
RPM_HASH = "e1ea6e6237c7d98eb6fe045c7e9992cbda76f0648af3852aeb7de4ed666eab2125e85b57f2b3f9f854621e903874a5657a6e421b9816a1c9316dab79c209376a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elbioimp-doc"

RDEPENDS:${PN} += ""

inherit rpm
