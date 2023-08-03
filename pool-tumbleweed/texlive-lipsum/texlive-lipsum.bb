SUMMARY = "Easy access to the Lorem Ipsum and other dummy texts"
DESCRIPTION = "This package gives you easy access to 150 paragraphs of the \
Lorem Ipsum dummy text provided by https://lipsum.com, plus a \
growing list of other dummy texts in different languages."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn60561"

RPM_NAME = "texlive-lipsum-2023.209.2.7svn60561-55.1.noarch.rpm"
RPM_HASH = "736e192c90c8af15b215dfb7c437cbb971cafc730ac1f8a6265d0a890d67a39278ed3c127e1ea7f6d3127e5d465ebbd0e6cd2c4d074c625f741a770479e06c2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cicero.ltd.tex \
tex-lipsum-cs.ltd.tex \
tex-lipsum.ltd.tex \
tex-lipsum.sty \
texlive-lipsum"

RDEPENDS:${PN} += "/usr/bin/sh \
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
