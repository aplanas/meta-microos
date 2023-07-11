SUMMARY = "Documentation for texlive-matc3"
DESCRIPTION = "This package includes the documentation for texlive-matc3"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0.1svn29845"

RPM_NAME = "texlive-matc3-doc-2023.208.1.0.1svn29845-53.1.noarch.rpm"
RPM_HASH = "c9f585bdbff58603c020c46e25c83fddfa2a9f49f784fd883db831a7fe5455d62ed91e2958951abfd9a0ccd74eb73f548a1c9132155d53323647c239721ec123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-matc3-doc-it \
texlive-matc3-doc"

RDEPENDS:${PN} += ""

inherit rpm
