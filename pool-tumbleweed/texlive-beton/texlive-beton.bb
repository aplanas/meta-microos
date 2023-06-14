SUMMARY = "Use Concrete fonts"
DESCRIPTION = "Typeset a LaTeX2e document with the Concrete fonts designed by \
Don Knuth and used in his book 'Concrete Mathematics'."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-beton-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "17270806225649b062edda52b97735a02ca31f9dc0398771a6df781413570bc00639c44c84296d1baa840bb8dfc0f042e53fe107a8efd1e9e06a45e8098bd6d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beton.sty \
texlive-beton"

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
