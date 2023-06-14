SUMMARY = "Plain TeX format for pTeX and e-pTeX"
DESCRIPTION = "The bundle contains the plain TeX format for pTeX and e-pTeX."
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn64072"

RPM_NAME = "texlive-ptex-base-2023.201.svn64072-53.1.noarch.rpm"
RPM_HASH = "04cc7437a15d8cccdcec2476ce65ae8c5e77dd3bc6e86ba2330b82113b00174c1e5807d75cec4a1700fbb38e39a05018051d5e3cf453bc1818363cacbefe719c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ascii-jplain.tex \
tex-kinsoku.tex \
tex-ptex.tex \
texlive-ptex-base"

RDEPENDS:${PN} += "/bin/sh \
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
