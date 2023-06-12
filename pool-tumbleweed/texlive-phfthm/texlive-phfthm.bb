SUMMARY = "Goodies for theorems and proofs"
DESCRIPTION = "This package provides enhanced theorem and proof environments \
based on the amsthm original versions. It allows for hooks to \
be placed, adds some default goodies and is highly \
customizable. In particular, it can connect theorems to proofs, \
automatically producing text such as 'See proof on page XYZ' \
and 'Proof of Theorem 4: ...'."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn60735"

RPM_NAME = "texlive-phfthm-2023.201.1.2svn60735-51.1.noarch.rpm"
RPM_HASH = "34e394f9dbb7a1ea5b07a9d76db7bdf03b6840ce24bc97b619f40ae1f65dd579c6925028da03538d839c67ac3e16ff30dd0bd2c9f7948904ee442ba661fe00d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(phfthm.sty) \
texlive-phfthm"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(aliascnt.sty) \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(amsthm.sty) \
tex(etoolbox.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
