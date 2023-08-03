SUMMARY = "Deprecated: Figures divided into subfigures"
DESCRIPTION = "Provides support for the manipulation and reference of small or \
'sub' figures and tables within a single figure or table \
environment. It is convenient to use this package when your \
subfigures are to be separately captioned, referenced, or are \
to be included in the List-of-Figures. A new \\subfigure command \
is introduced which can be used inside a figure environment for \
each subfigure. An optional first argument is used as the \
caption for that subfigure. The package is now considered \
obsolete: it was superseded by subfig, but users may find the \
more recent subcaption package more satisfactory."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.5svn15878"

RPM_NAME = "texlive-subfigure-2023.209.2.1.5svn15878-58.1.noarch.rpm"
RPM_HASH = "6fc51e3fecd2fee9e4baada051e6419d09d62507452e3127324a075e6af698e4d057fd26c244b0175aafe2769073c1d50864d56392e5d6e07edc702e14c767bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-subfigure.cfg \
tex-subfigure.sty \
texlive-subfigure"

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
