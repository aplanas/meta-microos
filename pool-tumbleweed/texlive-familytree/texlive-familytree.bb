SUMMARY = "Draw family trees"
DESCRIPTION = "Boxes describe individuals; lines connecting boxes represent \
sibling or parent-child relationships, or marriages. Excluding \
the marriage box, you can get a maleline/patrilineal tree, or a \
femaleline/matrilineal tree. For Japanese, the jlreq.cls \
vertical option (tate) is supported."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.1svn63739"

RPM_NAME = "texlive-familytree-2023.209.3.1svn63739-53.1.noarch.rpm"
RPM_HASH = "629a5eec003d679cd3ac730411bc1ccdcb67d9f1f261ee07543b156e8f7b4a9da8893bd2612f3b4df62bac23820a09ecc3ecc13b20832a4c1b4cfd0caed356d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-familytree.sty \
texlive-familytree"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-relsize.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
