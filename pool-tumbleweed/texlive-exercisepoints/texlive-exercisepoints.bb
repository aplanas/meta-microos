SUMMARY = "A LaTeX package to count exercises and points"
DESCRIPTION = "The package can be used to facilitate exercise counting and \
exercise point counting in a LaTeX-document. It counts the \
number of exercises and it sums all the points of the exercises \
in a document. Especially for exams it is also common to have \
an overview of all exercises and their maximal points. This is \
also supported by this package by providing a macro to retrieve \
the points of each exercise."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.3svn49590"

RPM_NAME = "texlive-exercisepoints-2023.201.1.2.3svn49590-52.1.noarch.rpm"
RPM_HASH = "7739b686f48d87c3e71386bc58a214b2212c68be8a46ce5d8f57db022980661407d0a0ce65035533663daeaafd81b3d0e1ffb9836083eedc9bce57e354710a4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(exercisepoints.sty) \
texlive-exercisepoints"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
