SUMMARY = "Documentation for texlive-light-latex-make"
DESCRIPTION = "This package includes the documentation for texlive-light-latex-make"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.0svn66473"

RPM_NAME = "texlive-light-latex-make-doc-2023.209.1.2.0svn66473-55.1.noarch.rpm"
RPM_HASH = "853effcdbebee0e625cc445162e36a8ed2bf04dc4086d7f256aaa810c5f5d869ca5516afc51a486518ad03b64c0c2460461b731afdfbb0f3de47ec288a852a31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-llmk.1 \
texlive-light-latex-make-doc"

RDEPENDS:${PN} += ""

inherit rpm
