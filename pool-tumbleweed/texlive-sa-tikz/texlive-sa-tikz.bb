SUMMARY = "TikZ library to draw switching architectures"
DESCRIPTION = "The package provides a library that offers an easy way to draw \
switching architectures and to customize their aspect."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7asvn32815"

RPM_NAME = "texlive-sa-tikz-2023.201.0.0.7asvn32815-53.1.noarch.rpm"
RPM_HASH = "8ee0a25472873870384ec978a5b324d58bc0778b6aad7a6ee1b068b6cee2b5f43e76123f5cd2382115009ec42e756bd16fe16cca88f87d770fe962f6f993f6ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sa-tikz.sty \
tex-tikzlibraryswitching-architectures.code.tex \
texlive-sa-tikz"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
