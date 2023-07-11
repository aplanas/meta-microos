SUMMARY = "Extend graphicx to improve placement of graphics"
DESCRIPTION = "Graphbox is an extension of the standard graphicx LaTeX2e \
package to allow the placement of graphics relative to the \
'current position' using additional optional arguments of \
\\includegraphics. For example, changing the vertical alignment \
is convenient for using graphics as elements of (mathematical) \
formulae. Options for shifting, smashing and hiding the \
graphics may be useful in support, for example, of the beamer \
framework."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn46360"

RPM_NAME = "texlive-graphbox-2023.201.1.1svn46360-53.2.noarch.rpm"
RPM_HASH = "0d4063b32fe808decec6bbe4d421967c30f48d6febe13586a1bc15c133a6933e9ef4f0f7906def99231aeb8af8a9443c53026aa43ef1aa4137d1c8ddea950c9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-graphbox.sty \
texlive-graphbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
