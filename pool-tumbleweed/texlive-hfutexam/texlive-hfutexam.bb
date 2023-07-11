SUMMARY = "Exam class for Hefei University of Technology (China)"
DESCRIPTION = "This package provides an exam class for Hefei University of \
Technology (China). Gai Wen Dang Lei Ti Gong Liao He Fei Gong \
Ye Da Xue Kao Shi Shi Juan Mo Ban , Dian Ji Xia Fang Download \
Lai Xia Zai Suo You Wen Jian ."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn66550"

RPM_NAME = "texlive-hfutexam-2023.201.1.7svn66550-53.2.noarch.rpm"
RPM_HASH = "0bf4f137c48413e591744862b98884744c6c9350f7be0f38bc6c74e366ee63bd24c9d316e159b163b6b6f4d4c8234f94a46631a2122abf2682d3a6f328941c06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hfutexam.cls \
texlive-hfutexam"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-ctexart.cls \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-lastpage.sty \
tex-tikz.sty \
tex-ulem.sty \
tex-zref-savepos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
