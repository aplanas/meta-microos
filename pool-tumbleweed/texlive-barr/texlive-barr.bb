SUMMARY = "Diagram macros by Michael Barr"
DESCRIPTION = "Diagxy is a general diagramming package, useful for diagrams in \
a number of mathematical disciplines. Diagxy is a development \
of an earlier (successful) package to use the facilities of the \
xypic bundle."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn38479"

RPM_NAME = "texlive-barr-2023.209.svn38479-54.1.noarch.rpm"
RPM_HASH = "e25547a6b4e3820f42cd9b7839404625d4b7c4a5a88a32759eb6352e5f9f18ae657776772c3e4a079a45f8fccb52d0f8c23338ff6761ff80ab27dd2f211df40c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-diagxy.tex \
texlive-barr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
