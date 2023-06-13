SUMMARY = "Draw family trees"
DESCRIPTION = "Boxes describe individuals; lines connecting boxes represent \
sibling or parent-child relationships, or marriages. Excluding \
the marriage box, you can get a maleline/patrilineal tree, or a \
femaleline/matrilineal tree. For Japanese, the jlreq.cls \
vertical option (tate) is supported."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.1svn63739"

RPM_NAME = "texlive-familytree-2023.201.3.1svn63739-52.1.noarch.rpm"
RPM_HASH = "4b478f85c4898b654f45d3aee86ca2476526add19243c810d53203c27506cf535c6fd9942c3496a9b761b5561c34761cd5c623a5f84f1e9ee1c79a81dadc4229"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(familytree.sty) \
texlive-familytree"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(relsize.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
