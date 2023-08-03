SUMMARY = "Plain TeX formats and documents for upTeX"
DESCRIPTION = "The bundle contains plain TeX format files and documents for \
upTeX and and e-upTeX."
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn65802"

RPM_NAME = "texlive-uptex-base-2023.209.svn65802-54.1.noarch.rpm"
RPM_HASH = "9b6b29969cfce86c285fd97d32ac503f3687e21bdea57abb153f6f3e7fe20da3cd090c82ab7cf1fae74b89aa1e722358a666ee7d8a1cba22d1e1b18d34c0b81a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ukinsoku.tex \
tex-uptex.tex \
texlive-uptex-base"

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
