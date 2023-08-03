SUMMARY = "TikZ library to draw switching architectures"
DESCRIPTION = "The package provides a library that offers an easy way to draw \
switching architectures and to customize their aspect."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7asvn32815"

RPM_NAME = "texlive-sa-tikz-2023.209.0.0.7asvn32815-54.1.noarch.rpm"
RPM_HASH = "20a07570116c9040219375b60d379d25af4f50d9d490c9fb628445572287ecc55b695608e1966c0d4ecd7a28acc188aaa67b7adf492f7132883da7184a0c7ebc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sa-tikz.sty \
tex-tikzlibraryswitching-architectures.code.tex \
texlive-sa-tikz"

RDEPENDS:${PN} += "/usr/bin/sh \
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
