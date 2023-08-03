SUMMARY = "Macros to use the Symbats3 dingbats fonts"
DESCRIPTION = "This package makes available for LaTeX the glyphs in Feorag's \
OpenType Symbats3 neopagan dingbats fonts."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn63833"

RPM_NAME = "texlive-symbats3-2023.209.svn63833-58.1.noarch.rpm"
RPM_HASH = "89559d088a7df554a3688dd7be0f124eb7f4cbc9fefadadbb07ebb7583ce8760c884257f4b2f5077fc27d57ab21e01ed359917c31ce3f00c0aeb4c7dfd78d04e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-symbats3.sty \
texlive-symbats3"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fontspec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
