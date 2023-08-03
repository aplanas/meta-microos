SUMMARY = "Documentation for texlive-canoniclayout"
DESCRIPTION = "This package includes the documentation for texlive-canoniclayout"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn64889"

RPM_NAME = "texlive-canoniclayout-doc-2023.209.1.0svn64889-53.1.noarch.rpm"
RPM_HASH = "4f555dc56d95d88ff464d6c05fce7af3e0d9593ca138b3fa0f008d718735629bac29d76c7e9d8ab1542825bf97646ad7347ebc7daaeeb8234359027b9828865b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-canoniclayout-doc"

RDEPENDS:${PN} += ""

inherit rpm
