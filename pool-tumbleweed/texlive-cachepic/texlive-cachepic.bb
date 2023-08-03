SUMMARY = "Convert document fragments into graphics"
DESCRIPTION = "The bundle simplifies and automates conversion of document \
fragments into external EPS or PDF files. The bundle consists \
of two parts: a LaTeX package that implements a document level \
interface, and a command line tool (written in lua) that \
generates the external graphics."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn26313"

RPM_NAME = "texlive-cachepic-2023.209.1.0svn26313-53.1.noarch.rpm"
RPM_HASH = "6abe40d74375580be111b1315a53161a1b2af623439b85d9e553983cf94604229630c3d6caa8c17fa122f6a6933cb4a724fafbb5f00db9078fc52971ccccafb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cachepic.sty \
tex-prcachepic.def \
texlive-cachepic"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-verbatim.sty \
texlive \
texlive-cachepic-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
