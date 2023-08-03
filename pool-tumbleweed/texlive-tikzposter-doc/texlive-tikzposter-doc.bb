SUMMARY = "Documentation for texlive-tikzposter"
DESCRIPTION = "This package includes the documentation for texlive-tikzposter"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn32732"

RPM_NAME = "texlive-tikzposter-doc-2023.209.2.0svn32732-53.1.noarch.rpm"
RPM_HASH = "f276dc1c81178881010e48bdfc67321b945fa5890b81ff2737f4b33c82b83d977b2c0ab06cac3356ccb617fbbe2ca044e9c9b300e8a3db216447a975d2aabdd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzposter-doc"

RDEPENDS:${PN} += ""

inherit rpm
