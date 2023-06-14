SUMMARY = "Load multiple datamodels in BibLaTeX"
DESCRIPTION = "The package adds the possibility to BibLaTeX to load data \
models from multiple sources."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn37081"

RPM_NAME = "texlive-biblatex-multiple-dm-2023.201.1.0.1svn37081-53.1.noarch.rpm"
RPM_HASH = "973d58e08297d84df70e50e39501476ef008132811e29e97ad94749319cc81ab1762e09dc5a0cda1ec3ee435021d49a1be74b6dd7c74033c9c00e9992d75e808"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-multiple-dm.sty \
tex-multiple-dm.bbx \
texlive-biblatex-multiple-dm"

RDEPENDS:${PN} += "/bin/sh \
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
