SUMMARY = "Macros for typesetting Quantum Information Theory"
DESCRIPTION = "This package provides macros to typeset some general \
mathematical operators (identity operator, trace, diagonal, \
rank, ...), a powerful implementation of the bra-ket notation \
(kets, bras, brakets, matrix elements etc. which can be sized \
as required), delimited expressions such as averages and norms, \
and some basic Lie algebra/group names. Macros for entropy \
measures for quantum information theory (smooth min- and \
max-entropy, smooth relative entropies, etc.) are also \
provided."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.1svn60734"

RPM_NAME = "texlive-phfqit-2023.209.4.1svn60734-52.1.noarch.rpm"
RPM_HASH = "f7e8e75cbe0ff62b9f41a70a98a1a0a02d5162c0255525bf0c91576aee6354099a55a12ad83be9f6c1ec0eb89043e0a199e24a91731f57a81ce638db5196d363"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phfqit.sty \
texlive-phfqit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-calc.sty \
tex-dsfont.sty \
tex-etoolbox.sty \
tex-kvoptions.sty \
tex-mathrsfs.sty \
tex-mathtools.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
