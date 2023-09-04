SUMMARY = "Persian for LaTeX, using XeTeX"
DESCRIPTION = "This package provides a convenient interface for typesetting \
Persian and English texts in LaTeX, using the XeTeX engine."
LICENSE = "LPPL-1.0"

PV = "2023.209.24.8svn64872"

RPM_NAME = "texlive-xepersian-2023.209.24.8svn64872-53.2.noarch.rpm"
RPM_HASH = "4097244a06e236ce6b98414efcdd17e5a1d1e61b61f42c3a913df486ff0424f9da9421962e8b5c33b10dc02c88db5fdbeda05e797d4ec8e5dbe9c9f56fdc56f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-algorithm-xepersian.def \
tex-algorithmic-xepersian.def \
tex-amsart-xepersian.def \
tex-amsbook-xepersian.def \
tex-appendix-xepersian.def \
tex-article-xepersian.def \
tex-artikel1-xepersian.def \
tex-artikel2-xepersian.def \
tex-artikel3-xepersian.def \
tex-backref-xepersian.def \
tex-beamer-xepersian.def \
tex-beamerbasetranslator-xepersian.def \
tex-bidimoderncv-xepersian.def \
tex-bidituftesidenote-xepersian.def \
tex-boek-xepersian.def \
tex-boek3-xepersian.def \
tex-book-xepersian.def \
tex-bookest-xepersian.def \
tex-breqn-xepersian.def \
tex-color-localise-xepersian.def \
tex-enumerate-xepersian.def \
tex-enumitem-xepersian.def \
tex-extarticle-xepersian.def \
tex-extbook-xepersian.def \
tex-extrafootnotefeatures-xepersian.def \
tex-extreport-xepersian.def \
tex-fancyref-xepersian.def \
tex-footnote-xepersian.def \
tex-framed-xepersian.def \
tex-glossaries-xepersian.def \
tex-hyperref-xepersian.def \
tex-imsproc-xepersian.def \
tex-kashida-xepersian.def \
tex-latex-localise-commands-xepersian.def \
tex-latex-localise-environments-xepersian.def \
tex-latex-localise-messages-xepersian.def \
tex-latex-localise-misc-xepersian.def \
tex-listings-xepersian.def \
tex-loadingorder-xepersian.def \
tex-localise-xepersian.def \
tex-memoir-xepersian.def \
tex-minitoc-xepersian.def \
tex-natbib-xepersian.def \
tex-packages-localise-xepersian.def \
tex-persian-tex-text-nonumbers.map \
tex-persian-tex-text.map \
tex-rapport1-xepersian.def \
tex-rapport3-xepersian.def \
tex-refrep-xepersian.def \
tex-report-xepersian.def \
tex-scrartcl-xepersian.def \
tex-scrbook-xepersian.def \
tex-scrreprt-xepersian.def \
tex-soul-xepersian.def \
tex-tkz-linknodes-xepersian.def \
tex-tocloft-xepersian.def \
tex-url-xepersian.def \
tex-varioref-xepersian.def \
tex-xepersian-localise-commands-xepersian.def \
tex-xepersian-localise-environments-xepersian.def \
tex-xepersian-magazine.cls \
tex-xepersian-mathdigitspec.sty \
tex-xepersian-multiplechoice.sty \
tex-xepersian-persiancal.sty \
tex-xepersian.sty \
texlive-xepersian"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-bidi.sty \
tex-calc.sty \
tex-datetime.sty \
tex-extrafootnotefeatures-xetex-bidi.def \
tex-fancybox.sty \
tex-fancyhdr.sty \
tex-fontspec.sty \
tex-fullpage.sty \
tex-geometry.sty \
tex-hyphenat.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-lastpage.sty \
tex-multicol.sty \
tex-multido.sty \
tex-pifont.sty \
tex-ragged2e.sty \
tex-setspace.sty \
tex-tabularx.sty \
tex-textpos.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
