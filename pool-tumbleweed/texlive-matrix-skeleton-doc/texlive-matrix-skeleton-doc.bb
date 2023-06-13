SUMMARY = "Documentation for texlive-matrix-skeleton"
DESCRIPTION = "This package includes the documentation for texlive-matrix-skeleton"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn65013"

RPM_NAME = "texlive-matrix-skeleton-doc-2023.201.1.1svn65013-52.1.noarch.rpm"
RPM_HASH = "b367bd94e25d2aa15698aaa70d22921228bcc9c2aeef7b361540899e1dd8cdec617068b897c7a804c7c6960f1152ff5b0f60b3b80f0c0ec07134cdc678e70522"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-matrix-skeleton-doc"

RDEPENDS:${PN} += ""

inherit rpm
