SUMMARY = "Spotlight highlighting for Beamer"
DESCRIPTION = "The package allows dramatic highlighting of words and phrases \
by painting shapes around them. It is chiefly intended for use \
in Beamer presentations, but it can be used in other document \
classes as well."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn22408"

RPM_NAME = "texlive-spot-2023.209.1.1svn22408-58.1.noarch.rpm"
RPM_HASH = "d55b114defd7d7524dcbd613fe0dd1ab659604bbe731d5f9d885e4db54cd6de548420b396921d21bced0b770ca4b187dab661a6c7ae717698b706fd886133970"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spot.sty \
texlive-spot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
