SUMMARY = "Load multiple datamodels in BibLaTeX"
DESCRIPTION = "The package adds the possibility to BibLaTeX to load data \
models from multiple sources."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn37081"

RPM_NAME = "texlive-biblatex-multiple-dm-2023.209.1.0.1svn37081-54.1.noarch.rpm"
RPM_HASH = "269ca8d15047c6c2bc7374953da5fa7eff2b44d850d13d6c22a31795fc353a8863683107a13dccfaa3300c98c8ef0cc7f9b0a0167e27247f8023cf8da128bc84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-multiple-dm.sty \
tex-multiple-dm.bbx \
texlive-biblatex-multiple-dm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
