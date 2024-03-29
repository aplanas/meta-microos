SUMMARY = "TeX auxiliary programs"
DESCRIPTION = "Myriad additional TeX-related support programs. Includes \
programs and macros for DVI file manipulation, literate \
programming, patgen, and plenty more."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn66381"

RPM_NAME = "texlive-collection-binextra-2023.208.svn66381-60.1.noarch.rpm"
RPM_HASH = "51952bb951f5f0372ce59bfde09cf18af052309799f3b097f52d85442909bca640f40ad819b077c5911b08b9e98cfb6db266318690bf13ff894c01793df5091e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-binextra"

RDEPENDS:${PN} += "texlive-a2ping \
texlive-adhocfilelist \
texlive-arara \
texlive-asymptote \
texlive-bibtex8 \
texlive-bibtexu \
texlive-bundledoc \
texlive-checklistings \
texlive-chklref \
texlive-chktex \
texlive-clojure-pamphlet \
texlive-cluttex \
texlive-collection-basic \
texlive-ctan-chk \
texlive-ctan-o-mat \
texlive-ctanbib \
texlive-ctanify \
texlive-ctanupload \
texlive-ctie \
texlive-cweb \
texlive-de-macro \
texlive-detex \
texlive-digestif \
texlive-dtl \
texlive-dtxgen \
texlive-dviasm \
texlive-dvicopy \
texlive-dvidvi \
texlive-dviinfox \
texlive-dviljk \
texlive-dviout-util \
texlive-dvipng \
texlive-dvipos \
texlive-dvisvgm \
texlive-findhyph \
texlive-fragmaster \
texlive-git-latexdiff \
texlive-gsftopk \
texlive-hook-pre-commit-pkg \
texlive-ketcindy \
texlive-lacheck \
texlive-latex-git-log \
texlive-latex-papersize \
texlive-latex2man \
texlive-latex2nemeth \
texlive-latexdiff \
texlive-latexfileversion \
texlive-latexindent \
texlive-latexmk \
texlive-latexpand \
texlive-light-latex-make \
texlive-listings-ext \
texlive-ltxfileinfo \
texlive-ltximg \
texlive-luajittex \
texlive-make4ht \
texlive-match-parens \
texlive-mflua \
texlive-mkjobtexmf \
texlive-optexcount \
texlive-patgen \
texlive-pdfbook2 \
texlive-pdfcrop \
texlive-pdfjam \
texlive-pdflatexpicscale \
texlive-pdftex-quiet \
texlive-pdftosrc \
texlive-pdfxup \
texlive-pfarrei \
texlive-pkfix \
texlive-pkfix-helper \
texlive-purifyeps \
texlive-pythontex \
texlive-scripts-extra \
texlive-seetexk \
texlive-spix \
texlive-srcredact \
texlive-sty2dtx \
texlive-synctex \
texlive-tex4ebook \
texlive-texaccents \
texlive-texcount \
texlive-texdef \
texlive-texdiff \
texlive-texdirflatten \
texlive-texdoc \
texlive-texdoctk \
texlive-texfot \
texlive-texliveonfly \
texlive-texloganalyser \
texlive-texlogfilter \
texlive-texlogsieve \
texlive-texosquery \
texlive-texplate \
texlive-texware \
texlive-tie \
texlive-tpic2pdftex \
texlive-typeoutfileinfo \
texlive-upmendex \
texlive-web \
texlive-xindex \
texlive-xpdfopen"

inherit rpm
