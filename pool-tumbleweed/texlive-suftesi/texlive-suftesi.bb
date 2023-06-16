SUMMARY = "A document class for typesetting theses, books and articles"
DESCRIPTION = "The class can be used to typeset any kind of book (originally \
designed for use in the humanities)."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2.0svn60991"

RPM_NAME = "texlive-suftesi-2023.201.3.2.0svn60991-57.1.noarch.rpm"
RPM_HASH = "b8f2001a86382d993a74045dd2a9024d1b7243932d4d560f0f0bab98ddd4715874b3cff9f51d8a6740e1c5dcc168eb744f3e8bec4aa3ed9392bc6a74da19dff8"
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
