SUMMARY = "Documentation for texlive-xpiano"
DESCRIPTION = "This package includes the documentation for texlive-xpiano"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn61719"

RPM_NAME = "texlive-xpiano-doc-2023.209.1.0svn61719-53.1.noarch.rpm"
RPM_HASH = "27135b6b56a6f85b1d5abf79d5e8b0e2ea6d3113fbbf7bdf7163c4d96f7bf8ecb634877f5be962196a328344c45ad0ff46d7db86820707ffe0dfc2831bf76105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xpiano-doc"

RDEPENDS:${PN} += ""

inherit rpm
