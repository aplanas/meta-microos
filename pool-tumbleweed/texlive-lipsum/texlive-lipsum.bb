SUMMARY = "Easy access to the Lorem Ipsum and other dummy texts"
DESCRIPTION = "This package gives you easy access to 150 paragraphs of the \
Lorem Ipsum dummy text provided by https://lipsum.com, plus a \
growing list of other dummy texts in different languages."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn60561"

RPM_NAME = "texlive-lipsum-2023.201.2.7svn60561-54.1.noarch.rpm"
RPM_HASH = "e1d211408ad464584601ac483a1900c96f45de26be1a5b9677fa2e6774fd63928e7112005729a2065ac016c609fb94c712fd8217619803c8362912f143542a28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cicero.ltd.tex \
tex-lipsum-cs.ltd.tex \
tex-lipsum.ltd.tex \
tex-lipsum.sty \
texlive-lipsum"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
