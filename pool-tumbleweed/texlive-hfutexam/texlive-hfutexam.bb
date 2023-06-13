SUMMARY = "Exam class for Hefei University of Technology (China)"
DESCRIPTION = "This package provides an exam class for Hefei University of \
Technology (China). Gai Wen Dang Lei Ti Gong Liao He Fei Gong \
Ye Da Xue Kao Shi Shi Juan Mo Ban , Dian Ji Xia Fang Download \
Lai Xia Zai Suo You Wen Jian ."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn66550"

RPM_NAME = "texlive-hfutexam-2023.201.1.7svn66550-53.1.noarch.rpm"
RPM_HASH = "29f4a082cd7b7cc04ddcd73bac40501d724eb09ecf48d78d406f190de3aa788cd8abc4ca37f37063170659cc45a2d2cbbdf403af7d4f5a252c3540fd0315f7ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hfutexam.cls) \
texlive-hfutexam"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(amsthm.sty) \
tex(ctexart.cls) \
tex(enumitem.sty) \
tex(etoolbox.sty) \
tex(fancyhdr.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(lastpage.sty) \
tex(tikz.sty) \
tex(ulem.sty) \
tex(zref-savepos.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
