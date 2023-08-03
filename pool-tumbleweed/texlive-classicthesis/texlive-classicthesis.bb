SUMMARY = "A 'classically styled' thesis package"
DESCRIPTION = "This package provides an elegant layout designed in homage to \
Bringhurst's 'The Elements of Typographic Style'. It makes use \
of a range of techniques to get the best results achievable \
using TeX. Included in the bundle are templates to make thesis \
writing easier."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.4.6svn48041"

RPM_NAME = "texlive-classicthesis-2023.209.4.6svn48041-54.1.noarch.rpm"
RPM_HASH = "d47a9874023d0a1626b4e17852157590435c64b47ec1d45f1ac0e0ce9f6ce6c002f1e4f152df052ef5cf5cbe684983ca2fc7867d3c983183c16407c35c679f0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-classicthesis-arsclassica.sty \
tex-classicthesis.sty \
texlive-classicthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-beramono.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-eulervm.sty \
tex-fontspec.sty \
tex-footmisc.sty \
tex-hyperref.sty \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-kvoptions.sty \
tex-listings.sty \
tex-mathpazo.sty \
tex-microtype.sty \
tex-mparhack.sty \
tex-prelim2e.sty \
tex-remreset.sty \
tex-scrlayer-scrpage.sty \
tex-scrtime.sty \
tex-textcase.sty \
tex-titlesec.sty \
tex-tocloft.sty \
tex-typearea.sty \
tex-unicode-math.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
