SUMMARY = "Linguistic examples and glosses, with reference capabilities"
DESCRIPTION = "The package provides macros for typesetting linguistic examples \
and glosses, with a refined mechanism for referencing examples \
and parts of examples. The package can be used with LaTeX using \
the .sty wrapper or with PlainTex."
LICENSE = "LPPL-1.0"

PV = "2023.209.5.1bsvn44499"

RPM_NAME = "texlive-expex-2023.209.5.1bsvn44499-53.1.noarch.rpm"
RPM_HASH = "8818b6f7f2e9d9897ff56aa28665523c6a83357db41c68d168293698946d722b5a6bee1aebea3d4cc8e1b0d26f597ede37516516d0b915a6c9fd87fe69c8829d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epltxchapno.sty \
tex-epltxfn.sty \
tex-eptexfn.tex \
tex-expex-demo.tex \
tex-expex.sty \
tex-expex.tex \
texlive-expex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
