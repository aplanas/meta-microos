SUMMARY = "Book Template for Qian Yuan Xue Fu"
DESCRIPTION = "qyxf-book is a LaTeX document class (template) developed by \
Qian Yuan Xue Fu (QYXF), a student club of Xi'an Jiaotong \
University (XJTU). Up to now, this template has been applied to \
academic counselling material ('course helpers') written by \
members of QYXF, including Solutions to University Physics: \
https://qyxf.site/latest/Da Wu Ti Jie (Shang ).pdf Notes on \
Computing Methods: https://qyxf.site/latest/Ji Suan Fang Fa Xie \
Ying -v1.1.pdf Guide to Computer Programming: \
https://qyxf.site/latest/Ji Suan Ji She Ji Cheng Xu Zhi Nan \
.pdf Features of the template: Minimalistic document style, as \
preferred for 'course helpers'. Several color schemes are \
offered, and it is easy to customize your own scheme. Simple \
interfaces for users to customize the style of preface, main \
part and so on. Currently the template is only designed for \
Chinese typesetting."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1.0svn56319"

RPM_NAME = "texlive-qyxf-book-2023.209.3.1.0svn56319-54.2.noarch.rpm"
RPM_HASH = "88b9037338d5219f94fe700c1b7e3dd4c0356b564549b6d548f590d4d9c4ebdac7570c297a90fbbbefbf05bd81a87a8a806e0204560296b29b4b791c7cdf5f13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-qyxf-book.cls \
texlive-qyxf-book"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-appendix.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-ctexbook.cls \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hologo.sty \
tex-hyperref.sty \
tex-kvoptions.sty \
tex-lastpage.sty \
tex-longtable.sty \
tex-natbib.sty \
tex-pifont.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-ulem.sty \
tex-unicode-math.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
