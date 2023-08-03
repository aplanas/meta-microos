SUMMARY = "Italian translation of amsthdoc: Using the amsthm package"
DESCRIPTION = "The amsthdoc-it package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45662"

RPM_NAME = "texlive-amsthdoc-it-2023.209.svn45662-55.1.noarch.rpm"
RPM_HASH = "92f1da157eff049e17732ebb5989c097f78d34df81bf30eb6a22661e340edac8a0f09238fb0dd218feef1c406102d68e183f191d44aae68b0d63d86e21b22d8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amsthdoc-it"

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
