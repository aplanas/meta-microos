SUMMARY = "LaTeX Thesis Template for Hefei University of Technology"
DESCRIPTION = "This project is based on the HFUT_Thesis LaTeX template of \
Hefei University of Technology compiled on the basis of \
ustctug/ustcthesis, in accordance with the latest version of \
Hefei University of Technology Graduate Dissertation Writing \
Specifications and Hefei University of Technology Undergraduate \
Graduation Project (Thesis) Work Implementation Rules."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.4svn64025"

RPM_NAME = "texlive-hfutthesis-2023.201.1.0.4svn64025-53.1.noarch.rpm"
RPM_HASH = "9c4bfed0d948253b86e599840e845184515f8d0f8be25c4749ffd6ef8b987fbdff59ee6cb2425875996ff9e3f89446ef06dda9ed2a54078ffc25ba94e1347170"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hfutthesis.cls) \
texlive-hfutthesis"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(bicaption.sty) \
tex(bm.sty) \
tex(calc.sty) \
tex(caption.sty) \
tex(color.sty) \
tex(ctexbook.cls) \
tex(enumitem.sty) \
tex(etoolbox.sty) \
tex(fancyhdr.sty) \
tex(filehook.sty) \
tex(fontenc.sty) \
tex(fontspec.sty) \
tex(footmisc.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(iftex.sty) \
tex(kvdefinekeys.sty) \
tex(kvoptions.sty) \
tex(kvsetkeys.sty) \
tex(multirow.sty) \
tex(natbib.sty) \
tex(newtxmath.sty) \
tex(newtxtext.sty) \
tex(titletoc.sty) \
tex(ulem.sty) \
tex(unicode-math.sty) \
tex(url.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
