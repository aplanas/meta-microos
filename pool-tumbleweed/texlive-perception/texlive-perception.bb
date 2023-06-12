SUMMARY = "BibTeX style for the journal Perception"
DESCRIPTION = "A product of custom-bib, provided simply to save others' time."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn48861"

RPM_NAME = "texlive-perception-2023.201.svn48861-51.1.noarch.rpm"
RPM_HASH = "5fd489e3e67a4206cb3d46f31236267e01c658b76351425b6fe1bf856ad10456d13c0debe662babb5b225957af729593501292851777a96551c5f58c81c6a9c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-perception"
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
