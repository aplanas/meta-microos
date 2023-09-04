SUMMARY = "LaTeX interface for the CJK category codes of upTeX"
DESCRIPTION = "The package provides management of the CJK category code \
('kcatcode'> table of the upTeX extended TeX engine. Package \
options are available for tailored use in the cases of \
documents that are principally written in Japanese, or \
principally written in English or other Western languages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn63967"

RPM_NAME = "texlive-pxcjkcat-2023.209.1.4svn63967-54.2.noarch.rpm"
RPM_HASH = "de367c8bd32784cffcc497203c737d6ddbc028ecc6b5e3d9f7781e7dd0367a4cca6537794b43fd6573fe60d453313b79ad16469871876a8cd260306eb77615ba"
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
