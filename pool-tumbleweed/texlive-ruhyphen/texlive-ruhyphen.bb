SUMMARY = "Russian hyphenation"
DESCRIPTION = "A collection of Russian hyphenation patterns supporting a \
number of Cyrillic font encodings, including T2, UCY (Omega \
Unicode Cyrillic), LCY, LWN (OT2), and koi8-r."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn21081"

RPM_NAME = "texlive-ruhyphen-2023.201.1.6svn21081-53.1.noarch.rpm"
RPM_HASH = "9df5d8c54fabcb88ead2be0d09713825ee461fb3bf6e6b3f1c7fdb2952895eaebabba0d83003ede84772799af7fb19704afd1697b193db676054e293ead80765"
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

RDEPENDS:${PN} += "/bin/sh \
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
