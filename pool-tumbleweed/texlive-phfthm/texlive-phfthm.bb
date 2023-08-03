SUMMARY = "Goodies for theorems and proofs"
DESCRIPTION = "This package provides enhanced theorem and proof environments \
based on the amsthm original versions. It allows for hooks to \
be placed, adds some default goodies and is highly \
customizable. In particular, it can connect theorems to proofs, \
automatically producing text such as 'See proof on page XYZ' \
and 'Proof of Theorem 4: ...'."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn60735"

RPM_NAME = "texlive-phfthm-2023.209.1.2svn60735-52.1.noarch.rpm"
RPM_HASH = "4cc6ff495b5fce9d9492f4866037dab882a80e97aa92e9845a3b280cbee1bb8cf49cc24b179a5c16abc464ce4f10e96ea0cb36976028eb4b2318d692f3554d68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phfthm.sty \
texlive-phfthm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-aliascnt.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-etoolbox.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
