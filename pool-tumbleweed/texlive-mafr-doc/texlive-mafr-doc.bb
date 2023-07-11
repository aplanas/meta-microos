SUMMARY = "Documentation for texlive-mafr"
DESCRIPTION = "This package includes the documentation for texlive-mafr"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.1.0svn15878"

RPM_NAME = "texlive-mafr-doc-2023.208.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "3507ce67cc77bd63e8a73b14a01d28daa92cec2b5ecc660ee251929534216507254a1492d6c083829c96dd870a018e66385496ec990ea3d2b17973762e514f8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-mafr-doc-fr;en \
texlive-mafr-doc"

RDEPENDS:${PN} += ""

inherit rpm
