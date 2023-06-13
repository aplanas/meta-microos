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

PV = "2023.201.2.1.5svn15878"

RPM_NAME = "texlive-subfigure-2023.201.2.1.5svn15878-57.1.noarch.rpm"
RPM_HASH = "a9598b7544e932a45ccca5319900e5a729194c349a785dc48d6721a5ae82848ac4966f31b5cc1f2498c237cad76fb271b903f8605d855082b19d5e0be924f78b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(subfigure.cfg) \
tex(subfigure.sty) \
texlive-subfigure"

RDEPENDS:${PN} += "/bin/sh \
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
