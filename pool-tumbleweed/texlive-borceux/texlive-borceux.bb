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

PV = "2023.209.svn21047"

RPM_NAME = "texlive-borceux-2023.209.svn21047-53.1.noarch.rpm"
RPM_HASH = "c7b2f17d8e2dc19c567e8ea4455fa3b9156adb5d9d7f1c9aa9fd735b3507e4acfa56befdddabb4c286f7c83c6f7a53bd78e4a1a1f34d69643b4c47ec542d264a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-borceux"

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
