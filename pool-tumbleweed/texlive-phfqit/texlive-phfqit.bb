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

PV = "2023.201.4.1svn60734"

RPM_NAME = "texlive-phfqit-2023.201.4.1svn60734-51.1.noarch.rpm"
RPM_HASH = "ca1957e4fd29daa818f28d94b903da70e737b527366a2df30e48a8c133539ef0ca5a84708ad1c959810e8681eb8c6129dc16922911c903109febb82de42cdb0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phfqit.sty \
texlive-phfqit"

RDEPENDS:${PN} += "/bin/sh \
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
