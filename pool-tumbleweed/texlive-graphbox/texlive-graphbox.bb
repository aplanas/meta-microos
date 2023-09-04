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

RPM_NAME = "texlive-graphbox-2023.209.1.1svn46360-54.2.noarch.rpm"
RPM_HASH = "33f06fbb4a219c71af6e3150b5c57182cee260395aceacdfc5ae2b30b001020c8974b7426ffc5b120170dbf165323f8d2553c31e3919c6ade3bcecd073bb26c5"
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
