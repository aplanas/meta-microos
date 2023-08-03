SUMMARY = "Russian hyphenation"
DESCRIPTION = "A collection of Russian hyphenation patterns supporting a \
number of Cyrillic font encodings, including T2, UCY (Omega \
Unicode Cyrillic), LCY, LWN (OT2), and koi8-r."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn21081"

RPM_NAME = "texlive-ruhyphen-2023.209.1.6svn21081-54.1.noarch.rpm"
RPM_HASH = "be7fa1f4cf279e2eff89178649b517efa5b552b6920621d483c2c89cdb14599c3b6f23a369c0f38ead83888427e3ed33054edb588298f5b43be348595dca354b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-catkoi.tex \
tex-cyryoal.tex \
tex-cyryoas.tex \
tex-cyryoct.tex \
tex-cyryodv.tex \
tex-cyryomg.tex \
tex-cyryovl.tex \
tex-cyryozn.tex \
tex-enrhm2.tex \
tex-hypht2.tex \
tex-koi2koi.tex \
tex-koi2lcy.tex \
tex-koi2ot2.tex \
tex-koi2t2a.tex \
tex-koi2ucy.tex \
tex-ruenhyph.tex \
tex-ruhyphal.tex \
tex-ruhyphas.tex \
tex-ruhyphct.tex \
tex-ruhyphdv.tex \
tex-ruhyphen.tex \
tex-ruhyphmg.tex \
tex-ruhyphvl.tex \
tex-ruhyphzn.tex \
texlive-ruhyphen"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
