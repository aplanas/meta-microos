SUMMARY = "Hacks to make writing quantum papers for revtex4-1 less painful"
DESCRIPTION = "This package provides a number of useful hacks to solve common \
annoyances with the revtex4-1 package, and to define notation \
in common use within quantum information. In doing so, it \
imports and configures a number of commonly-available and used \
packages, and where reasonable, provides fallbacks. It also \
warns when users try to load packages which are known to be \
incompatible with revtex4-1."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.11svn43505"

RPM_NAME = "texlive-revquantum-2023.209.0.0.11svn43505-54.1.noarch.rpm"
RPM_HASH = "02e2b18fd55ea0598744f296c8bb2982122d00320e6c9dce4ef13b467945ea16f98379b4e540f3d8151a98fdf4b13d5b13369804680a6f29e8c16a3d0fd93701"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-revquantum.sty \
texlive-revquantum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithm.sty \
tex-algpseudocode.sty \
tex-amsbsy.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-babel.sty \
tex-braket.sty \
tex-color.sty \
tex-etoolbox.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-letltxmacro.sty \
tex-listings.sty \
tex-mathpazo.sty \
tex-sourcecodepro.sty \
tex-stmaryrd.sty \
tex-textcomp.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
