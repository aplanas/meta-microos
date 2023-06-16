SUMMARY = "A 'classically styled' thesis package"
DESCRIPTION = "This package provides an elegant layout designed in homage to \
Bringhurst's 'The Elements of Typographic Style'. It makes use \
of a range of techniques to get the best results achievable \
using TeX. Included in the bundle are templates to make thesis \
writing easier."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.4.6svn48041"

RPM_NAME = "texlive-classicthesis-2023.201.4.6svn48041-53.1.noarch.rpm"
RPM_HASH = "dcc1942f3e84b7b74ef048e15f18b76b5721550086de76665c68e4e53a703582f3126d7149290f2e84ebf64edcc99569fd858105628fc28e9208f3ff40e40844"
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
