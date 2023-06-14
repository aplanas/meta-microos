SUMMARY = "Hacks to make writing quantum papers for revtex4-1 less painful"
DESCRIPTION = "This package provides a number of useful hacks to solve common \
annoyances with the revtex4-1 package, and to define notation \
in common use within quantum information. In doing so, it \
imports and configures a number of commonly-available and used \
packages, and where reasonable, provides fallbacks. It also \
warns when users try to load packages which are known to be \
incompatible with revtex4-1."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11svn43505"

RPM_NAME = "texlive-revquantum-2023.201.0.0.11svn43505-53.1.noarch.rpm"
RPM_HASH = "6361ca41288e22b8ce9a13c553fd5d654c67e89c949543ea5fb08fa5f17e1366530551b556a19260c290901e0f5ae489c2f409f5a98209f709bcef5bfea73691"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-revquantum.sty \
texlive-revquantum"

RDEPENDS:${PN} += "/bin/sh \
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
