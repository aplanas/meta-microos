SUMMARY = "Documentation for texlive-pst-rubans"
DESCRIPTION = "This package includes the documentation for texlive-pst-rubans"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn23464"

RPM_NAME = "texlive-pst-rubans-doc-2023.209.1.2svn23464-54.1.noarch.rpm"
RPM_HASH = "64c6a92046f1c3479369d43c5bf5f253608f4ba8595befc677fbf9c1bdd14bb97111d99d31a348859fe9aa1211750a326471ce6bfa454fbc49b9b68f6ac025e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-rubans-doc"

RDEPENDS:${PN} += ""

inherit rpm
