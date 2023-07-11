SUMMARY = "LaTeX interface for the CJK category codes of upTeX"
DESCRIPTION = "The package provides management of the CJK category code \
('kcatcode'> table of the upTeX extended TeX engine. Package \
options are available for tailored use in the cases of \
documents that are principally written in Japanese, or \
principally written in English or other Western languages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn63967"

RPM_NAME = "texlive-pxcjkcat-2023.201.1.4svn63967-53.2.noarch.rpm"
RPM_HASH = "2281663a8fa9eb463b7160a36cad25b00d0335952c7bcb8bd7b0b67db45255d12585ff392bfe14100dfda38901b08709db4ed9420c4869b5400026719c2c3a32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pxcjkcat.sty \
texlive-pxcjkcat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
