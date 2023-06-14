SUMMARY = "Makeindex development sources"
DESCRIPTION = "The package contains the development sources of makeindex, as \
derived from the texlive subversion repository."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn62517"

RPM_NAME = "texlive-makeindex-2023.201.svn62517-52.1.noarch.rpm"
RPM_HASH = "226eca494fe63e1f9b1c25fced2b951e243c29f728fd9a35a24e43996b12b4de70fce0959bac15c94e7882fd001bd04024905860e25d5332e211f2be330c99c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-idxmac.tex \
texlive-makeindex"

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
texlive-makeindex-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
