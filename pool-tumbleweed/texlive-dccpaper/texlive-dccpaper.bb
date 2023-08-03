SUMMARY = "Typeset papers for the International Journal of Digital Curation"
DESCRIPTION = "The LaTeX class ijdc-v14 produces camera-ready papers and \
articles suitable for inclusion in the International Journal of \
Digital Curation, with applicability from volume 14 onwards; a \
legacy class ijdc-v9 is provided for papers and articles \
written for volumes 9-13. The similar idcc class can be used \
for submissions to the International Digital Curation \
Conference, beginning with the 2015 conference."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn61763"

RPM_NAME = "texlive-dccpaper-2023.209.2.3svn61763-53.1.noarch.rpm"
RPM_HASH = "10fb2059cb007188f2fcc2dfca521846e4143d989c35f8c8e36ab90aa552e2ae8919b6d6feeab3f6a2d49cb042a115f7efcf0be90b638979bd848acc6122aa96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dccpaper-base.sty \
tex-idcc.cls \
tex-ijdc-v14.cls \
tex-ijdc-v9.cls \
texlive-dccpaper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-GoSans.sty \
tex-array.sty \
tex-article.cls \
tex-atbegshi.sty \
tex-babel.sty \
tex-baskervald.sty \
tex-baskervillef.sty \
tex-booktabs.sty \
tex-calc.sty \
tex-color.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-footmisc.sty \
tex-graphicx.sty \
tex-helvet.sty \
tex-hyperxmp.sty \
tex-ifpdf.sty \
tex-iftex.sty \
tex-mathptmx.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-tgheros.sty \
tex-titlesec.sty \
tex-xcolor.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
