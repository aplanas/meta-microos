SUMMARY = "Geneva School of Economics and Management PhD thesis format"
DESCRIPTION = "The class provides a PhD thesis template for the Geneva School \
of Economics and Management (GSEM), University of Geneva, \
Switzerland. The class provides utilities to easily set up the \
cover page, the front matter pages, the page headers, etc., \
conformant to the official guidelines of the GSEM Faculty for \
writing PhD dissertations."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9.4svn56291"

RPM_NAME = "texlive-gsemthesis-2023.209.0.0.9.4svn56291-54.1.noarch.rpm"
RPM_HASH = "290d24ce47254b36918b18e79787cec7203a6760e895dc53473607411f1edca1dc69009000cafdc1c3eefd7667e4de1dd740ed23834ea2fb363764b893744c88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gsemthesis.cls \
texlive-gsemthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-babel.sty \
tex-book.cls \
tex-csquotes.sty \
tex-datetime.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-inputenc.sty \
tex-lmodern.sty \
tex-setspace.sty \
tex-subfigure.sty \
tex-url.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
