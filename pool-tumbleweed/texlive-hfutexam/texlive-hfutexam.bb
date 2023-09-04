SUMMARY = "Exam class for Hefei University of Technology (China)"
DESCRIPTION = "This package provides an exam class for Hefei University of \
Technology (China). Gai Wen Dang Lei Ti Gong Liao He Fei Gong \
Ye Da Xue Kao Shi Shi Juan Mo Ban , Dian Ji Xia Fang Download \
Lai Xia Zai Suo You Wen Jian ."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn66550"

RPM_NAME = "texlive-hfutexam-2023.209.1.7svn66550-54.2.noarch.rpm"
RPM_HASH = "b64313b75bdf30ebd5a7bad502fc23f04f191ae323bcae44aee92683b3fd03c6c65fda9017d6ae0972fccbb18efd2b1c122563b01c5d71d41432d5bb713fe01c"
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
