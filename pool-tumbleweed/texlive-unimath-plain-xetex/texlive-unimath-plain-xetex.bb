SUMMARY = "OpenType math support in (plain) XeTeX"
DESCRIPTION = "This package provides OpenType math font support in plain TeX \
format. It only works with the XeTeX engine."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2bsvn66394"

RPM_NAME = "texlive-unimath-plain-xetex-2023.201.0.0.2bsvn66394-53.1.noarch.rpm"
RPM_HASH = "7cae66d1f7c416d33ecfa54dba1645bdf8c5165e19e8f134250178ff79ff9b72465685cd462a06c6c2f19f73f0fdd0e93e70885cc00a410f29c128582a93c892"
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
