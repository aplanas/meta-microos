SUMMARY = "Prosper preview"
DESCRIPTION = "This class is used with LaTeX presentations using the prosper \
class. ppr-prv stands for 'Prosper Preview'. The aim of this \
class is to produce a printable version of the slides written \
with Prosper, with two slides per page."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.13csvn15878"

RPM_NAME = "texlive-ppr-prv-2023.201.0.0.13csvn15878-52.1.noarch.rpm"
RPM_HASH = "1f2baa53d5ca32782898ce65ccce01e2a5e25b869357bce4e48bb8dc20cc788262c96fb7b841537501e547ab556ff92823beed612979ded6862baf0219d5b1af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(HAP-ppr-prv.def) \
tex(ppr-prv.cls) \
texlive-ppr-prv"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(article.cls) \
tex(float.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(ifpdf.sty) \
tex(keyval.sty) \
tex(pstricks.sty) \
tex(textcomp.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
