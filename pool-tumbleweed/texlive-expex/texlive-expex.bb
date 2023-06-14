SUMMARY = "Linguistic examples and glosses, with reference capabilities"
DESCRIPTION = "The package provides macros for typesetting linguistic examples \
and glosses, with a refined mechanism for referencing examples \
and parts of examples. The package can be used with LaTeX using \
the .sty wrapper or with PlainTex."
LICENSE = "LPPL-1.0"

PV = "2023.201.5.1bsvn44499"

RPM_NAME = "texlive-expex-2023.201.5.1bsvn44499-52.1.noarch.rpm"
RPM_HASH = "7e8feb452316214e1fe923d6a5bed40c49691330e8c2895107a1b964ca7b32c35760be836ff1fa7b760101bfdabb193bec3055400a0391d82f2a0d016c39f3a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epltxchapno.sty \
tex-epltxfn.sty \
tex-eptexfn.tex \
tex-expex-demo.tex \
tex-expex.sty \
tex-expex.tex \
texlive-expex"

RDEPENDS:${PN} += "/bin/sh \
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
