SUMMARY = "Documentation for texlive-kanbun"
DESCRIPTION = "This package includes the documentation for texlive-kanbun"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn62026"

RPM_NAME = "texlive-kanbun-doc-2023.209.1.2svn62026-56.1.noarch.rpm"
RPM_HASH = "9ee4537ffd328d1dee48480a42fd45ed3da356995d0e9b390a0e47b43949303de037c7783c6cab8bdccc44c47d61a7a36e487b77a51b54d7e80a5317a387708d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ja) \
locale(texlive-kanbun-doc-zh \
texlive-kanbun-doc"

RDEPENDS:${PN} += ""

inherit rpm
