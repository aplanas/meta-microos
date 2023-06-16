SUMMARY = "A font for in-text Feynman diagrams"
DESCRIPTION = "Feyn may be used to produce relatively simple Feynman diagrams \
within equations in a LaTeX document. While the feynmf package \
is good at drawing large diagrams for figures, the present \
package and its fonts allow diagrams within equations or text, \
at a matching size. The fonts are distributed as Metafont \
source, and macros for their use are also provided."
LICENSE = "BSD-3-Clause"

PV = "2023.201.0.0.4.3svn63945"

RPM_NAME = "texlive-feyn-2023.201.0.0.4.3svn63945-52.1.noarch.rpm"
RPM_HASH = "9471e324737909461b545553b31b0dd78d6212a1ea9fe970283318c048ec293b24349ad62ac2fa917c0bec82bf68932942eb126b801ffa030e73c0642313c8ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-feyn.sty \
tex-feyn10.tfm \
tex-feyn11.tfm \
tex-feyn12.tfm \
tex-feyn18.tfm \
tex-feyn24.tfm \
tex-feyntext10.tfm \
tex-feyntext11.tfm \
tex-feyntext12.tfm \
tex-feyntext18.tfm \
tex-feyntext24.tfm \
tex-feynx10.tfm \
tex-feynx11.tfm \
tex-feynx12.tfm \
tex-feynx18.tfm \
tex-feynx24.tfm \
texlive-feyn"

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
