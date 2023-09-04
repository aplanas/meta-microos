SUMMARY = "Syntax highlighting for LaTeX"
DESCRIPTION = "This package provides extensive colored syntax highlighting for \
LaTeX. For this purpose it builds on the generic listings \
package."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58392"

RPM_NAME = "texlive-highlightlatex-2023.209.svn58392-54.2.noarch.rpm"
RPM_HASH = "296a3f86a78e1a390ab9670275f51459cc2ca31ec6e8e60452097812fd1b4d3361877c7529a01dcbab5193e34f9c47b5846202000f2cd520f5527acff9d134d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-highlightlatex.sty \
texlive-highlightlatex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-listings.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
