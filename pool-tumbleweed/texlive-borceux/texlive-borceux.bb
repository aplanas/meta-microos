SUMMARY = "Diagram macros by Francois Borceux"
DESCRIPTION = "The macros support the construction of diagrams, such as those \
that appear in category theory texts. The user gives the list \
of vertices and arrows to be included, just as when composing a \
matrix, and the program takes care of computing the dimensions \
of the arrows and realizing the pagesetting. All the user has \
to do about the arrows is to specify their type (monomorphism, \
pair of adjoint arrows, etc.) and their direction (north, \
south-east, etc.); 12 types and 32 directions are available."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21047"

RPM_NAME = "texlive-borceux-2023.201.svn21047-52.1.noarch.rpm"
RPM_HASH = "91520c36c97196847ea655b782c6ac526fa716a4e7ca04fd028517f1bf4a6e71eccf7cc9912bb26c5576edfb7f8caafb681ca6e10837b97b3c5df93aa0ea710e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-borceux"
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
