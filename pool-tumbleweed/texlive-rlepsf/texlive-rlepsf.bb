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

PV = "2023.201.svn19082"

RPM_NAME = "texlive-rlepsf-2023.201.svn19082-53.2.noarch.rpm"
RPM_HASH = "14fc58d906ea98887d47a9cec55d61be065e31db5600717174908102c5d50db46102e240f60346297081cec28328533bcc99e303b52340d805e3add4485800cc"
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
