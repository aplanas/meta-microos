SUMMARY = "LaTeX recommended packages"
DESCRIPTION = "A collection of recommended add-on packages for LaTeX which \
have widespread use."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn65512"

RPM_NAME = "texlive-collection-latexrecommended-2023.208.svn65512-58.1.noarch.rpm"
RPM_HASH = "5728306a99b084d2c87a8f1cd05a0da05388d03e1973de327c85203bf1165dad3f61fad564606b7d6ae02126f456c5898a673033c95d67263b72cdc8a23f3326"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-latexrecommended"

RDEPENDS:${PN} += "texlive-anysize \
texlive-attachfile2 \
texlive-beamer \
texlive-booktabs \
texlive-breqn \
texlive-caption \
texlive-cite \
texlive-cmap \
texlive-collection-latex \
texlive-crop \
texlive-ctable \
texlive-eso-pic \
texlive-etoolbox \
texlive-euenc \
texlive-euler \
texlive-everysel \
texlive-everyshi \
texlive-extsizes \
texlive-fancybox \
texlive-fancyref \
texlive-fancyvrb \
texlive-filehook \
texlive-float \
texlive-fontspec \
texlive-footnotehyper \
texlive-fp \
texlive-grffile \
texlive-hologo \
texlive-index \
texlive-infwarerr \
texlive-jknapltx \
texlive-koma-script \
texlive-l3experimental \
texlive-latexbug \
texlive-lineno \
texlive-listings \
texlive-lwarp \
texlive-mathspec \
texlive-mathtools \
texlive-mdwtools \
texlive-memoir \
texlive-metalogo \
texlive-microtype \
texlive-ms \
texlive-newfloat \
texlive-ntgclass \
texlive-parskip \
texlive-pdfcolfoot \
texlive-pdflscape \
texlive-pdfmanagement-testphase \
texlive-pdfpages \
texlive-pdftexcmds \
texlive-polyglossia \
texlive-psfrag \
texlive-ragged2e \
texlive-rcs \
texlive-sansmath \
texlive-section \
texlive-seminar \
texlive-sepnum \
texlive-setspace \
texlive-subfig \
texlive-textcase \
texlive-thumbpdf \
texlive-translator \
texlive-typehtml \
texlive-ucharcat \
texlive-underscore \
texlive-unicode-math \
texlive-xcolor \
texlive-xkeyval \
texlive-xltxtra \
texlive-xunicode"

inherit rpm
