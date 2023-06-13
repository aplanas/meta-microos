SUMMARY = "Documentation for texlive-baskervillef"
DESCRIPTION = "This package includes the documentation for texlive-baskervillef"
LICENSE = "OFL-1.1"

PV = "2023.201.1.051svn55475"

RPM_NAME = "texlive-baskervillef-doc-2023.201.1.051svn55475-53.1.noarch.rpm"
RPM_HASH = "7e74cd7fa1966e1d0ea27e2d673a52e02771db3dcdc13b3a485bf77e21e50b9e819a7f6ac2d04ece71e27a890549d67d148efc9814f76dff212ce44850362fcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-baskervillef-doc"

RDEPENDS:${PN} += ""

inherit rpm
