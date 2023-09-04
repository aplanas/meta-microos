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

RPM_NAME = "texlive-xesearch-2023.209.0.0.2svn51908-53.2.noarch.rpm"
RPM_HASH = "ec337f370bc922f4b26617b6f98df5ff528aa5cd85fc9a35799cb915faafe58c38409cc0e6c499fb20d6d73042a7068619082a506be18d44a973edbffa5bfd4a"
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
