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

RPM_NAME = "texlive-rlepsf-2023.209.svn19082-54.1.noarch.rpm"
RPM_HASH = "d8c53167abfd0331f2abf1e49c09f42ec0ee35b1f842d40f62cd53c8e3074636283804a3568a19dafa96ce7a433de6808c55d5c335a5d2c6589d7ceaead52780"
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
