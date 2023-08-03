SUMMARY = "Class for producing books for the publisher 'Teubner Verlag'"
DESCRIPTION = "The bgteubner document class has been programmed by order of \
the Teubner Verlag, Wiesbaden, Germany, to ensure that books of \
this publisher have a unique layout. Unfortunately, most of the \
documentation is only available in German. Since the document \
class is intended to generate a unique layout, many things \
(layout etc.) are fixed and cannot be altered by the user. If \
you want to use the document class for another purpose than \
publishing with the Teubner Verlag, this may arouse unwanted \
restrictions (for instance, the document class provides only \
two paper sizes: DIN A5 and 17cm x 24cm; only two font families \
are supported: Times and European Computer Modern)."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.11svn54080"

RPM_NAME = "texlive-bgteubner-2023.209.2.11svn54080-54.1.noarch.rpm"
RPM_HASH = "c04c8e4330854dd7b47270b79d4421856f5efc7bae0ea99e9f55ae5b37f16a799a7db732d6f18ab999aedc567cb838e323b124a94a9606eb3c4ae695f4cfd960"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bgteubner.cls \
tex-hhfixme.sty \
tex-hhsubfigure.sty \
tex-ptmxcomp.sty \
texlive-bgteubner"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-array.sty \
tex-babel.sty \
tex-babelbib.sty \
tex-booktabs.sty \
tex-color.sty \
tex-courier.sty \
tex-exscale.sty \
tex-fixltx2e.sty \
tex-fixmath.sty \
tex-fnbreak.sty \
tex-fontenc.sty \
tex-framed.sty \
tex-ginpenc.sty \
tex-graphicx.sty \
tex-helvet.sty \
tex-hfoldsty.sty \
tex-hhtensor.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-longtable.sty \
tex-makeidx.sty \
tex-mathcomp.sty \
tex-mathptmx.sty \
tex-mdwlist.sty \
tex-multicol.sty \
tex-numprint.sty \
tex-onlyamsmath.sty \
tex-paralist.sty \
tex-pdfcprot.sty \
tex-ragged2e.sty \
tex-relsize.sty \
tex-scrbook.cls \
tex-setspace.sty \
tex-slantsc.sty \
tex-subfloat.sty \
tex-textcomp.sty \
tex-verbatim.sty \
tex-warning.sty \
tex-wasysym.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
