SUMMARY = "Documentation for texlive-principia"
DESCRIPTION = "This package includes the documentation for texlive-principia"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn58927"

RPM_NAME = "texlive-principia-doc-2023.201.1.3svn58927-52.1.noarch.rpm"
RPM_HASH = "28608c0d44b3deb24253f4c2d8b14eba667d0f518f6f74d955a48730f659975c208dee9e412d768546dea9aaaf71cdddedcd9c3c80125c6ebdc53a0e7765ba10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-principia-doc"
RDEPENDS:${PN} += ""

inherit rpm
