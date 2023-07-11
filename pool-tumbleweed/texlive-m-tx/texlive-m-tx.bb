SUMMARY = "A preprocessor for pmx"
DESCRIPTION = "M-Tx is a preprocessor to pmx, which is itself a preprocessor \
to musixtex, a music typesetting system. The prime motivation \
to the development of M-Tx was to provide lyrics for music to \
be typeset. In fact, pmx now provides a lyrics interface, but \
M-Tx continues in use by those who prefer its language."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.63dsvn64182"

RPM_NAME = "texlive-m-tx-2023.208.0.0.63dsvn64182-53.1.noarch.rpm"
RPM_HASH = "7b9639c220a75b3d6cd8854988cdd4d181edc2ad8758f84ba3510f25c92d29f03ce75b6433fc5f4aac05a3f82668d5a647113579bfaad2a2299dc8d1d840a6bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mtx.tex \
tex-mtxlatex.sty \
texlive-m-tx"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-m-tx-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
