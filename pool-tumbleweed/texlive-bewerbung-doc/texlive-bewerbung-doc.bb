SUMMARY = "Documentation for texlive-bewerbung"
DESCRIPTION = "This package includes the documentation for texlive-bewerbung"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn61632"

RPM_NAME = "texlive-bewerbung-doc-2023.201.1.3svn61632-53.1.noarch.rpm"
RPM_HASH = "da4f8598c15b418089740170bcc39fb71353253453a975f221bab840cc22b5bd908abd6776d5fe9444add907a8d4242bf1336c94c70eeb59d9a0c7aa8e557033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "en) \
locale(texlive-bewerbung-doc:de;de \
texlive-bewerbung-doc"
RDEPENDS:${PN} += ""

inherit rpm
