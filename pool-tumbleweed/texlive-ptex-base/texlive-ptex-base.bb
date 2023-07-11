SUMMARY = "Plain TeX format for pTeX and e-pTeX"
DESCRIPTION = "The bundle contains the plain TeX format for pTeX and e-pTeX."
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn64072"

RPM_NAME = "texlive-ptex-base-2023.201.svn64072-53.2.noarch.rpm"
RPM_HASH = "ba14873825bcaa684194677ef0994f118583a8609f8616f5b8800b37f9577c50c6dc5d6af3e8483010932616d1bafe7c451271acc7feccb925b2cba7396fb2e0"
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
