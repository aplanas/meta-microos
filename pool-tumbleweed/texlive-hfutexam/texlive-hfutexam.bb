SUMMARY = "Exam class for Hefei University of Technology (China)"
DESCRIPTION = "This package provides an exam class for Hefei University of \
Technology (China). Gai Wen Dang Lei Ti Gong Liao He Fei Gong \
Ye Da Xue Kao Shi Shi Juan Mo Ban , Dian Ji Xia Fang Download \
Lai Xia Zai Suo You Wen Jian ."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn66550"

RPM_NAME = "texlive-hfutexam-2023.209.1.7svn66550-54.1.noarch.rpm"
RPM_HASH = "f7b53e031a4fb64bd9ecb291bb866fd79f4ae86b10eceb72033ec86fa313a21bced20b680fc636ed5ab8d5ae42d85ad86ed27a4538a31a0aae997155f175ecd7"
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
