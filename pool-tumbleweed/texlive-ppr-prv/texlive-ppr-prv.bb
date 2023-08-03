SUMMARY = "Prosper preview"
DESCRIPTION = "This class is used with LaTeX presentations using the prosper \
class. ppr-prv stands for 'Prosper Preview'. The aim of this \
class is to produce a printable version of the slides written \
with Prosper, with two slides per page."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.13csvn15878"

RPM_NAME = "texlive-ppr-prv-2023.209.0.0.13csvn15878-53.1.noarch.rpm"
RPM_HASH = "5a2e021638bf03fb57f812a825894cc0dc7e586c7701582207f99cbb386d117f158acc86fd630c7adb376274cb5a5c096f194d37b7a610fef7c66d477d04bbce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-HAP-ppr-prv.def \
tex-ppr-prv.cls \
texlive-ppr-prv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-float.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-keyval.sty \
tex-pstricks.sty \
tex-textcomp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
