SUMMARY = "Essential programs and files"
DESCRIPTION = "These files are regarded as basic for any TeX system, covering \
plain TeX macros, Computer Modern fonts, and configuration for \
common drivers; no LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn59159"

RPM_NAME = "texlive-collection-basic-2023.208.svn59159-58.1.noarch.rpm"
RPM_HASH = "3dae9ce726072d4725e19d402937ac9a704a2b0636097ce41e18cf88b5e5cfaad3f061cc0fb45ac48bba99ee20ced452901a7f7074957e97355cd89fb0e92e2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-basic \
tex-tex \
texlive-collection-basic"

RDEPENDS:${PN} += "texlive-amsfonts \
texlive-bibtex \
texlive-cm \
texlive-colorprofiles \
texlive-dvipdfmx \
texlive-dvips \
texlive-ec \
texlive-enctex \
texlive-etex \
texlive-etex-pkg \
texlive-glyphlist \
texlive-graphics-def \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-hyphenex \
texlive-ifplatform \
texlive-iftex \
texlive-knuth-lib \
texlive-knuth-local \
texlive-kpathsea \
texlive-lua-alt-getopt \
texlive-luahbtex \
texlive-luatex \
texlive-makeindex \
texlive-metafont \
texlive-mflogo \
texlive-mfware \
texlive-modes \
texlive-pdftex \
texlive-plain \
texlive-scripts \
texlive-tex \
texlive-tex-ini-files \
texlive-texlive-common \
texlive-texlive-en \
texlive-texlive.infra \
texlive-unicode-data \
texlive-xdvi"

inherit rpm
