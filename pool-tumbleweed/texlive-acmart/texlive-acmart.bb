SUMMARY = "Class for typesetting publications of ACM"
DESCRIPTION = "This package provides a class for typesetting publications of \
the Association for Computing Machinery (ACM)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.88svn64967"

RPM_NAME = "texlive-acmart-2023.209.1.88svn64967-55.1.noarch.rpm"
RPM_HASH = "f5160eb37d5d9883283435719a4ef2ed8b2c512aec8a85d4c693386547a8409a173bf8ea21fe271011595cc49f15fc34955e5978badfa1568fe996844688c55e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-acmart.cls \
tex-acmauthoryear.bbx \
tex-acmauthoryear.cbx \
tex-acmnumeric.bbx \
tex-acmnumeric.cbx \
texlive-acmart"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsart.cls \
tex-authoryear-comp.bbx \
tex-authoryear-comp.cbx \
tex-babel.sty \
tex-balance.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-cmap.sty \
tex-comment.sty \
tex-draftwatermark.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-fontenc.sty \
tex-framed.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-hyperxmp.sty \
tex-iftex.sty \
tex-libertine.sty \
tex-manyfoot.sty \
tex-microtype.sty \
tex-natbib.sty \
tex-newtxmath.sty \
tex-numeric.cbx \
tex-pbalance.sty \
tex-refcount.sty \
tex-setspace.sty \
tex-textcase.sty \
tex-totpages.sty \
tex-trad-plain.bbx \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xpatch.sty \
tex-xstring.sty \
tex-zi4.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
