SUMMARY = "A LaTeX package to count exercises and points"
DESCRIPTION = "The package can be used to facilitate exercise counting and \
exercise point counting in a LaTeX-document. It counts the \
number of exercises and it sums all the points of the exercises \
in a document. Especially for exams it is also common to have \
an overview of all exercises and their maximal points. This is \
also supported by this package by providing a macro to retrieve \
the points of each exercise."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.3svn49590"

RPM_NAME = "texlive-exercisepoints-2023.209.1.2.3svn49590-53.1.noarch.rpm"
RPM_HASH = "add836e0183698ab8c0eb0a645988ffe543f698aecc6a196dcb84ed8ae46955ca85065f0e6152531bf08d0b7fecc239ce7793ac36ea1fa98772c4a744a6f81d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exercisepoints.sty \
texlive-exercisepoints"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
