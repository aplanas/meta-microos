SUMMARY = "Japanese"
DESCRIPTION = "Support for Japanese; additional packages are in \
collection-langcjk."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn64603"

RPM_NAME = "texlive-collection-langjapanese-2023.208.svn64603-60.1.noarch.rpm"
RPM_HASH = "8dc9d7f77493a5a1868bc2aa1ac7874a1ad46a7060e20685033d819d7189f11ed4365343b0070e96b93d4bbee6093b62d80fc2f6022cc6670fca208b3b08d181"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langjapanese"

RDEPENDS:${PN} += "texlive-ascmac \
texlive-asternote \
texlive-babel-japanese \
texlive-bxbase \
texlive-bxcjkjatype \
texlive-bxghost \
texlive-bxjaholiday \
texlive-bxjalipsum \
texlive-bxjaprnind \
texlive-bxjatoucs \
texlive-bxjscls \
texlive-bxorigcapt \
texlive-bxwareki \
texlive-collection-langcjk \
texlive-convbkmk \
texlive-endnotesj \
texlive-gckanbun \
texlive-gentombow \
texlive-haranoaji \
texlive-haranoaji-extra \
texlive-ieejtran \
texlive-ifptex \
texlive-ifxptex \
texlive-ipaex \
texlive-japanese-mathformulas \
texlive-japanese-otf \
texlive-jieeetran \
texlive-jlreq \
texlive-jlreq-deluxe \
texlive-jpneduenumerate \
texlive-jpnedumathsymbols \
texlive-jsclasses \
texlive-kanbun \
texlive-lshort-japanese \
texlive-luatexja \
texlive-mendex-doc \
texlive-morisawa \
texlive-pbibtex-base \
texlive-pbibtex-manual \
texlive-platex \
texlive-platex-tools \
texlive-platexcheat \
texlive-plautopatch \
texlive-ptex \
texlive-ptex-base \
texlive-ptex-fontmaps \
texlive-ptex-fonts \
texlive-ptex-manual \
texlive-ptex2pdf \
texlive-pxbase \
texlive-pxchfon \
texlive-pxcjkcat \
texlive-pxjahyper \
texlive-pxjodel \
texlive-pxrubrica \
texlive-pxufont \
texlive-texlive-ja \
texlive-uplatex \
texlive-uptex \
texlive-uptex-base \
texlive-uptex-fonts \
texlive-wadalab \
texlive-zxjafbfont \
texlive-zxjatype"

inherit rpm
