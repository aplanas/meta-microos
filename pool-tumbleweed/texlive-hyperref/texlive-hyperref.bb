SUMMARY = "Extensive support for hypertext in LaTeX"
DESCRIPTION = "The hyperref package is used to handle cross-referencing \
commands in LaTeX to produce hypertext links in the document. \
The package provides backends for the \\special set defined for \
HyperTeX DVI processors; for embedded pdfmark commands for \
processing by Acrobat Distiller (dvips and Y&Y's dvipsone); for \
Y&Y's dviwindo; for PDF control within pdfTeX and dvipdfm; for \
TeX4ht; and for VTeX's pdf and HTML backends. The package is \
distributed with the backref and nameref packages, which make \
use of the facilities of hyperref. The package depends on the \
author's kvoptions, ltxcmds and refcount packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.7.00vsvn65758"

RPM_NAME = "texlive-hyperref-2023.201.7.00vsvn65758-52.1.noarch.rpm"
RPM_HASH = "1895845e91d91d5d699571de4ce0356680aed9624737721d86bbcb27872a73bafef64d6ff7887d263c0ec9708f98aaa88bcf33ddbcfcae4604411753415d245c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-backref.sty \
tex-hdvipdfm.def \
tex-hdvips.def \
tex-hdvipson.def \
tex-hdviwind.def \
tex-hluatex.def \
tex-hpdftex.def \
tex-htex4ht.cfg \
tex-htex4ht.def \
tex-htexture.def \
tex-hvtex.def \
tex-hvtexhtm.def \
tex-hvtexmrk.def \
tex-hxetex.def \
tex-hyperref-patches.sty \
tex-hyperref.sty \
tex-hypertex.def \
tex-minitoc-hyper.sty \
tex-nameref.sty \
tex-nohyperref.sty \
tex-ntheorem-hyper.sty \
tex-pd1enc.def \
tex-pdfmark.def \
tex-psdextra.def \
tex-puarenc.def \
tex-puenc-extra.def \
tex-puenc-greekbasic.def \
tex-puenc.def \
tex-puvnenc.def \
tex-xr-hyper.sty \
texlive-hyperref"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-atveryend.sty \
tex-auxhook.sty \
tex-bitset.sty \
tex-color.sty \
tex-etexcmds.sty \
tex-expl3.sty \
tex-gettitlestring.sty \
tex-hycolor.sty \
tex-iftex.sty \
tex-infwarerr.sty \
tex-intcalc.sty \
tex-keyval.sty \
tex-kvdefinekeys.sty \
tex-kvoptions.sty \
tex-kvsetkeys.sty \
tex-letltxmacro.sty \
tex-ltxcmds.sty \
tex-minitoc.sty \
tex-ntheorem.sty \
tex-pdf14.sty \
tex-pdfescape.sty \
tex-pdftexcmds.sty \
tex-refcount.sty \
tex-rerunfilecheck.sty \
tex-stringenc.sty \
tex-tex4ht.sty \
tex-url.sty \
texlive \
texlive-atbegshi \
texlive-auxhook \
texlive-bitset \
texlive-etexcmds \
texlive-filesystem \
texlive-gettitlestring \
texlive-hycolor \
texlive-intcalc \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-kvdefinekeys \
texlive-kvsetkeys \
texlive-letltxmacro \
texlive-ltxcmds \
texlive-pdfescape \
texlive-refcount \
texlive-rerunfilecheck \
texlive-scripts \
texlive-scripts-bin \
texlive-stringenc \
texlive-url \
texlive-zapfding"

inherit rpm
