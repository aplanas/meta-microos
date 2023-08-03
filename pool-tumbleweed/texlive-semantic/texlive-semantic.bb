SUMMARY = "Help for writing programming language semantics"
DESCRIPTION = "Eases the typesetting of notation of semantics and compilers. \
Includes T-diagrams, various derivation symbols and inference \
trees."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn15878"

RPM_NAME = "texlive-semantic-2023.209.2.0svn15878-54.1.noarch.rpm"
RPM_HASH = "5c7b2bbed4415eb4a96c8f8cff2427eb2a4d924bf43825c26c39643c4b78265372d789438fecb39b1400a766b38be8ccd219bbecef83e1ff72fb5782d79f7d22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-infernce.sty \
tex-ligature.sty \
tex-reserved.sty \
tex-semantic.sty \
tex-shrthand.sty \
tex-tdiagram.sty \
texlive-semantic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-mathbbol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
