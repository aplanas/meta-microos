SUMMARY = "Manage references to experimental data"
DESCRIPTION = "The package provides a mechanism that maintains a fixed \
symbolic reference to numerical results; such results may vary \
as the project proceeds (and hence the project report \
develops)."
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.7svn62942"

RPM_NAME = "texlive-dataref-2023.204.0.0.7svn62942-54.1.noarch.rpm"
RPM_HASH = "fbfa13d13575e83a0fc3ba3d46f166d8c6a6b15c158dd1a49b8d08a35ff069f640a0f3193e9b02edd1ca6c7fa589fcfd63c43e644493e8519d8c42f80b41a7a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dataref.sty \
texlive-dataref"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-booktabs.sty \
tex-etoolbox.sty \
tex-iftex.sty \
tex-import.sty \
tex-kvoptions.sty \
tex-pdfcomment.sty \
tex-pgf.sty \
tex-xfp.sty \
tex-xtab.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
