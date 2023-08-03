SUMMARY = "Plain TeX format for pTeX and e-pTeX"
DESCRIPTION = "The bundle contains the plain TeX format for pTeX and e-pTeX."
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn64072"

RPM_NAME = "texlive-ptex-base-2023.209.svn64072-54.1.noarch.rpm"
RPM_HASH = "30c64c62dea4a1b797cd952bfe532601a535393f4cec703c37c3b6fcd46e169aa13e1ead97e8208ef2c255d4ffdf4ff5d127efb665ffe827981978a6e15c18cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ascii-jplain.tex \
tex-kinsoku.tex \
tex-ptex.tex \
texlive-ptex-base"

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
