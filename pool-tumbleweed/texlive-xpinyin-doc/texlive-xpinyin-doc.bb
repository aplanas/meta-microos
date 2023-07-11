SUMMARY = "Documentation for texlive-xpinyin"
DESCRIPTION = "This package includes the documentation for texlive-xpinyin"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1svn66115"

RPM_NAME = "texlive-xpinyin-doc-2023.201.3.1svn66115-52.2.noarch.rpm"
RPM_HASH = "41f78eaf95479f6ebea36049ed30440052c6761f02e449e03c82b287102e46e0558ca1c27e4071891383ef8648a0fb5465e2d3861a699cd544dd0a423c718a89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xpinyin-doc-zh \
texlive-xpinyin-doc"

RDEPENDS:${PN} += ""

inherit rpm
