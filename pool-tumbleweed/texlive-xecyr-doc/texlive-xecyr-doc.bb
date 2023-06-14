SUMMARY = "Documentation for texlive-xecyr"
DESCRIPTION = "This package includes the documentation for texlive-xecyr"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn54308"

RPM_NAME = "texlive-xecyr-doc-2023.201.1.2svn54308-52.1.noarch.rpm"
RPM_HASH = "93fa9483da035817c4ad99b05fb4819bfb2f4b708a7b9e6f7426c4e0b513c6953d744ecde7585a57dfb499e9fc9b8c2c79a932c33ab2476c1b82c083bfc52573"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xecyr-doc-ru \
texlive-xecyr-doc"

RDEPENDS:${PN} += ""

inherit rpm
