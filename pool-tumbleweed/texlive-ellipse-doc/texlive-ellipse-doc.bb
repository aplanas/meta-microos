SUMMARY = "Documentation for texlive-ellipse"
DESCRIPTION = "This package includes the documentation for texlive-ellipse"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn39025"

RPM_NAME = "texlive-ellipse-doc-2023.201.1.0svn39025-53.1.noarch.rpm"
RPM_HASH = "ec965a7abcef4041eee7ea61bb8ac9f2903ea1745a268ddcf75bd9f0e573fff5917b90c1a909fe10a7aa15cd6b4fd1060a255ca7f1051315cbb72373972fb028"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ellipse-doc"

RDEPENDS:${PN} += ""

inherit rpm
