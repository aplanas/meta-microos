SUMMARY = "Snowman variants using TikZ"
DESCRIPTION = "This LaTeX package provides a command \\scsnowman which can \
display many variants of 'snowman' ('yukidaruma' in Japanese). \
TikZ is required for drawing these snowmen."
LICENSE = "BSD-3-Clause"

PV = "2023.201.1.3csvn66115"

RPM_NAME = "texlive-scsnowman-2023.201.1.3csvn66115-53.1.noarch.rpm"
RPM_HASH = "13f9089357d25dd978805fc066f360f4d73bd7387b28d9c01069012063c97a883f849f8713fd0c325a4f460ecdd8f474e7c3d43b38c6d76cd7befd0e87eaa9b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scsnowman-normal.def \
tex-scsnowman.sty \
tex-sctkzsym-base.sty \
texlive-scsnowman"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-pxeveryshi.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
