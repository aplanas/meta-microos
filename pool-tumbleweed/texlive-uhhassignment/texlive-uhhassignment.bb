SUMMARY = "A document class for typesetting homework assignments"
DESCRIPTION = "This document class was created for typesetting solutions to \
homework assignments at the university of Hamburg (Universitat \
Hamburg)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn44026"

RPM_NAME = "texlive-uhhassignment-2023.209.1.0svn44026-54.1.noarch.rpm"
RPM_HASH = "02d67aaa722780a2c0d76f22344e1ee15c1237635f5bf33f665e08f2da4379af84bb89e4a12ac8cf12c7877a28e2607c86938f892e9b9605bd701339f987b80a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uhhassignment.cls \
texlive-uhhassignment"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-babel.sty \
tex-calc.sty \
tex-cmap.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-framed.sty \
tex-hyperref.sty \
tex-inputenc.sty \
tex-lastpage.sty \
tex-lmodern.sty \
tex-scrlayer-scrpage.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
