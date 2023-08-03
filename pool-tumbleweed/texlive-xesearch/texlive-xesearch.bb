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

PV = "2023.209.0.0.2svn51908"

RPM_NAME = "texlive-xesearch-2023.209.0.0.2svn51908-53.1.noarch.rpm"
RPM_HASH = "4ba202d4a337978e9ab9140f7a8050d6dbe22ba1e6c7464aeba903a397a718b9b7281d197695477525fcedc919d6b4539afe424f25cacde0030600d9ae5e9bd7"
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
