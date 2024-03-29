SUMMARY = "'Simple' class for reports, etcetera"
DESCRIPTION = "The class is intended for simple documents (e.g., reports \
handed in as coursework and the like). The class is small and \
straightforward; its design was inspired by that of the PracTeX \
journal style."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.12ksvn52412"

RPM_NAME = "texlive-skrapport-2023.209.0.0.12ksvn52412-58.1.noarch.rpm"
RPM_HASH = "2bebc7aa03c225020a60481ec053e4c62ce1a89b62d9713a141653f6b616863843e7a2965b3e517da8e717b6a42d96464e0b44479772b36bebfb72549f5aee12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-skrapport-colortheme-cruelwater.sty \
tex-skrapport-colortheme-default.sty \
tex-skrapport-colortheme-skdoc.sty \
tex-skrapport-colortheme-unscathed.sty \
tex-skrapport-colortheme-violet.sty \
tex-skrapport-size-common.sty \
tex-skrapport-size10pt.clo \
tex-skrapport-size11pt.clo \
tex-skrapport-size12pt.clo \
tex-skrapport.cls \
texlive-skrapport"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-MnSymbol.sty \
tex-PTSerif.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-arev.sty \
tex-babel.sty \
tex-calc.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-isodate.sty \
tex-isomath.sty \
tex-kpfonts.sty \
tex-l3keys2e.sty \
tex-lmodern.sty \
tex-mathpazo.sty \
tex-microtype.sty \
tex-multicol.sty \
tex-opensans.sty \
tex-polyglossia.sty \
tex-pxfonts.sty \
tex-skmath.sty \
tex-sourcecodepro.sty \
tex-textcomp.sty \
tex-tgpagella.sty \
tex-typearea.sty \
tex-unicode-math.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
