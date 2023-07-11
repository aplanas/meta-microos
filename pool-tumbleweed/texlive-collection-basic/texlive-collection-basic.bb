SUMMARY = "Essential programs and files"
DESCRIPTION = "These files are regarded as basic for any TeX system, covering \
plain TeX macros, Computer Modern fonts, and configuration for \
common drivers; no LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn59159"

RPM_NAME = "texlive-collection-basic-2023.208.svn59159-60.1.noarch.rpm"
RPM_HASH = "87069af068223f14ef1bef1b62b6d3ee47eff77ad9d1f4d49acb4cd65041a8995dddc9266587ca14f8ff4caf1fdada60625a08b0aff4c918bf73286929efe982"
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
