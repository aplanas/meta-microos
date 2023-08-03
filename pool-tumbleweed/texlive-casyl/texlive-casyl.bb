SUMMARY = "Typeset Cree/Inuktitut in Canadian Aboriginal Syllabics"
DESCRIPTION = "The bundle constitutes a font (as Metafont source) and LaTeX \
macros for its use within a document."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.0svn15878"

RPM_NAME = "texlive-casyl-2023.209.2.0svn15878-53.1.noarch.rpm"
RPM_HASH = "a55d0697a3b1cdc3eac68608b5be27e5cb5233120f32b9570623f04833931e98d8399d9c9e7ac1cebf81e2adf408340df0df54f86ee5e6bea98efc73e2cb0919"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-casyll10.tfm \
tex-casyltex.sty \
texlive-casyl"

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
