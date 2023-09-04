SUMMARY = "LaTeX Thesis Template for Hefei University of Technology"
DESCRIPTION = "This project is based on the HFUT_Thesis LaTeX template of \
Hefei University of Technology compiled on the basis of \
ustctug/ustcthesis, in accordance with the latest version of \
Hefei University of Technology Graduate Dissertation Writing \
Specifications and Hefei University of Technology Undergraduate \
Graduation Project (Thesis) Work Implementation Rules."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.4svn64025"

RPM_NAME = "texlive-hfutthesis-2023.209.1.0.4svn64025-54.2.noarch.rpm"
RPM_HASH = "cded3f69e16c1e22a9423eea98b1d3d551bee2c8d52bca1b74bf56acd4c22e6ee646d02a19e9485512e4f3da12ffb09556d8a3fb25cee6e116b4fc24842858cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hfutthesis.cls \
texlive-hfutthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-bicaption.sty \
tex-bm.sty \
tex-calc.sty \
tex-caption.sty \
tex-color.sty \
tex-ctexbook.cls \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-filehook.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-footmisc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-iftex.sty \
tex-kvdefinekeys.sty \
tex-kvoptions.sty \
tex-kvsetkeys.sty \
tex-multirow.sty \
tex-natbib.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-titletoc.sty \
tex-ulem.sty \
tex-unicode-math.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
