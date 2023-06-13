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

PV = "2023.201.3.1.0svn56319"

RPM_NAME = "texlive-qyxf-book-2023.201.3.1.0svn56319-53.1.noarch.rpm"
RPM_HASH = "9e022560079939f078f6d054b027206cd2fdc90b33c8c64c968200970d8f202d5f3c14010947b8fb82eb540cc0b79d77d1bf077c7b7cfef48f1aa817c3808bbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(qyxf-book.cls) \
texlive-qyxf-book"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(appendix.sty) \
tex(booktabs.sty) \
tex(caption.sty) \
tex(ctexbook.cls) \
tex(enumitem.sty) \
tex(etoolbox.sty) \
tex(fancyhdr.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(hologo.sty) \
tex(hyperref.sty) \
tex(kvoptions.sty) \
tex(lastpage.sty) \
tex(longtable.sty) \
tex(natbib.sty) \
tex(pifont.sty) \
tex(tcolorbox.sty) \
tex(tikz.sty) \
tex(titlesec.sty) \
tex(titletoc.sty) \
tex(ulem.sty) \
tex(unicode-math.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
