SUMMARY = "OpenType math support in (plain) XeTeX"
DESCRIPTION = "This package provides OpenType math font support in plain TeX \
format. It only works with the XeTeX engine."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2bsvn66394"

RPM_NAME = "texlive-unimath-plain-xetex-2023.209.0.0.2bsvn66394-54.1.noarch.rpm"
RPM_HASH = "5d6a484bb7e080c20d44b84128442cf9d47526d82a44f25735f24b79b08dc997228f881e0519aa6059d47b08846598dad193ae82e0a78d99b2c1fa855df3e44b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unimath-bb.map \
tex-unimath-bbit.map \
tex-unimath-bf.map \
tex-unimath-bfit.map \
tex-unimath-frak.map \
tex-unimath-frakbf.map \
tex-unimath-it.map \
tex-unimath-plain-xetex.tex \
tex-unimath-scr.map \
tex-unimath-scrbf.map \
tex-unimath-sf.map \
tex-unimath-sfbf.map \
tex-unimath-sfbfit.map \
tex-unimath-sfit.map \
tex-unimath-tt.map \
texlive-unimath-plain-xetex"

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
