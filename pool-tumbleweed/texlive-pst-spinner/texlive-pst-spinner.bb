SUMMARY = "Drawing a fidget spinner"
DESCRIPTION = "This package aims to propose a model of the fidget spinner \
gadget. It exists under different forms with 2, 3 poles and \
even more. We chose the most popular model: the triple Fidget \
Spinner. You can run the PSTricks related documents with \
XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn66115"

RPM_NAME = "texlive-pst-spinner-2023.201.1.02svn66115-53.2.noarch.rpm"
RPM_HASH = "7b3bf30cc34dc5759233dc2cb0ef15efe5987577ae969a7dc0f2c314d268a31e493ed185bd7b6462e4bbd1be0c08f3cc76b940637da85a5d8bb7b9cdb1221819"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-spinner.sty \
tex-pst-spinner.tex \
texlive-pst-spinner"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-node.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
