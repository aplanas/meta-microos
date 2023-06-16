SUMMARY = "A document class for typesetting homework assignments"
DESCRIPTION = "This document class was created for typesetting solutions to \
homework assignments at the university of Hamburg (Universitat \
Hamburg)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn44026"

RPM_NAME = "texlive-uhhassignment-2023.201.1.0svn44026-53.1.noarch.rpm"
RPM_HASH = "6914eb8aa8db58ea1c532bf4da3760d4bc842981a671524cedaab6405ecea41dbdd3b9c6af3a75616287ab45a7b2764f5942ef852ed96de4ccd7bfd9dc77e6e8"
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
