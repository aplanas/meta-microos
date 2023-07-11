SUMMARY = "A string finder for XeTeX"
DESCRIPTION = "The package finds strings (e.g. (parts of) words or phrases) \
and manipulates them (apply any macro), thus turning each word \
or phrase into a possible command. It is written in plain XeTeX \
and should thus work with any format (it is known to work with \
LaTeX and ConTeXt). The main application for the moment is \
XeIndex, an automatic index for XeLaTeX, but examples are given \
of simple use to check spelling, count words, and highlight \
syntax of programming languages."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn51908"

RPM_NAME = "texlive-xesearch-2023.201.0.0.2svn51908-52.2.noarch.rpm"
RPM_HASH = "5e6588fb14ae50784f7c7c0789fff2da366e053e518f3987525cce0dddd1ba56d3d3598d9b15d533e8f63b078b0dda50efe2b588be25dcc96ce355dbab4f17b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-xesearch.tex \
tex-xesearch.sty \
texlive-xesearch"

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
