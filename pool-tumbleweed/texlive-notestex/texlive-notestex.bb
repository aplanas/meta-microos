SUMMARY = "An all-in-one LaTeX notes package for students"
DESCRIPTION = "This is a modification of the original Jhep journal format in \
order to suit the needs of students in university. The goal of \
this package was to make notetaking easier for students and \
offer easy support for marginnotes along with a reliable and \
legible formatting structure."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn45396"

RPM_NAME = "texlive-notestex-2023.209.1.0svn45396-55.1.noarch.rpm"
RPM_HASH = "76a9498a07d5f4b943beb24012c35d210f9f9971c90465191a1c26d0a117a3b09f11abef36be6defe61a369e48a2bfb86e650bac7ec62d7e476cbc815a29b8b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-NotesTeX.sty \
texlive-notestex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-array.sty \
tex-bm.sty \
tex-booktabs.sty \
tex-cancel.sty \
tex-caption.sty \
tex-color.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-lmodern.sty \
tex-marginnote.sty \
tex-mathrsfs.sty \
tex-mathtools.sty \
tex-multicol.sty \
tex-natbib.sty \
tex-physics.sty \
tex-setspace.sty \
tex-sidenotes.sty \
tex-tabularx.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
