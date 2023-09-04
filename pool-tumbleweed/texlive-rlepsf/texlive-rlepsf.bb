SUMMARY = "Rewrite labels in EPS graphics"
DESCRIPTION = "A macro package for use with epsf.tex which allows PostScript \
labels in an Encapsulated PostScript file to be replaced by TeX \
labels. The package provides commands \\relabel (simply replace \
a PostScript string), \\adjustrelabel (replace a PostScript \
string, with position adjustment), and \\extralabel (add a label \
at given coordinates). You can, if you so choose, use the \
facilities of the labelfig package in place of using \
\\extralabel."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn19082"

RPM_NAME = "texlive-rlepsf-2023.209.svn19082-54.2.noarch.rpm"
RPM_HASH = "aa084e90bc6e327edcbec46b0aa1b0e8276d55ab3cbcd3058d88fa37ca941c81fe02d5131d70e0cdb8559309d5b159b9349da2071e00af5f879aa122dc702f98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rlepsf.tex \
texlive-rlepsf"

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
