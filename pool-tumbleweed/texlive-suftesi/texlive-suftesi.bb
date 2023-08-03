SUMMARY = "A document class for typesetting theses, books and articles"
DESCRIPTION = "The class can be used to typeset any kind of book (originally \
designed for use in the humanities)."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2.0svn60991"

RPM_NAME = "texlive-suftesi-2023.209.3.2.0svn60991-58.1.noarch.rpm"
RPM_HASH = "99f9eeaa12bcbd5880c9cfe2edeb2240ab3c587f66db16667e3e53c43bbf405ced2468bb7af100e8337923093bb8324b92f9427036537b246260c52971810cef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-suftesi.cls \
texlive-suftesi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsthm.sty \
tex-appendix.sty \
tex-beramono.sty \
tex-biolinum.sty \
tex-book.cls \
tex-caption.sty \
tex-cclicenses.sty \
tex-cochineal.sty \
tex-color.sty \
tex-crop.sty \
tex-emptypage.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fixltxhyph.sty \
tex-fontenc.sty \
tex-fontsize.sty \
tex-geometry.sty \
tex-iftex.sty \
tex-inconsolata.sty \
tex-libertine.sty \
tex-libertinust1math.sty \
tex-lmodern.sty \
tex-luatex85.sty \
tex-mathalpha.sty \
tex-mathpazo.sty \
tex-microtype.sty \
tex-multicol.sty \
tex-newpxmath.sty \
tex-newpxtext.sty \
tex-newtxmath.sty \
tex-substitutefont.sty \
tex-textcomp.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-xkeyval.sty \
tex-zref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
