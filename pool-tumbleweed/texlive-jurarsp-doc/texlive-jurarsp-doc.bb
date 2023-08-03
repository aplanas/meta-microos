SUMMARY = "Documentation for texlive-jurarsp"
DESCRIPTION = "This package includes the documentation for texlive-jurarsp"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.52svn15878"

RPM_NAME = "texlive-jurarsp-doc-2023.209.0.0.52svn15878-56.1.noarch.rpm"
RPM_HASH = "909bf18ef118670b49dce1bc8d9045bd5b6e0bb476bbf2d86ba04c1ba47fc9e4583bdd44f01e9cb4388ac4ac95c77f3565d68f2ffe03a6492cc4504217579a11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-jurarsp-doc-de \
texlive-jurarsp-doc"

RDEPENDS:${PN} += ""

inherit rpm
