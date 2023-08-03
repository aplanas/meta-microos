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

PV = "2023.209.1.1svn46360"

RPM_NAME = "texlive-graphbox-2023.209.1.1svn46360-54.1.noarch.rpm"
RPM_HASH = "5f51ca34f77f648107975d7bfcf1fe1a7ca8c684ee99df04f541accff1864d8205ff5a750f20b10775e90ea25ca5a87d3b35afabc3be8b1407e56759f198b296"
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
