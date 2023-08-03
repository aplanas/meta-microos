SUMMARY = "Bibliography of 'Die TeXnische Komodie'"
DESCRIPTION = "This package contains the bibliography for 'Die TeXnische \
Komodie', the journal of the German-speaking TeX User Group. It \
is updated on a quarterly basis."
LICENSE = "LPPL-1.0"

PV = "2023.209.2022_04svn65444"

RPM_NAME = "texlive-dtk-bibliography-2023.209.2022_04svn65444-53.1.noarch.rpm"
RPM_HASH = "e63cfe52dd757cb9d55eda81ded3a3b990fce34020dca80b8aa71ebb50e917570df70390df6bc15716d0043530576d042ad4c62b87d8203465f1cd333d5f0d8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dtk-authoryear.bbx \
tex-dtk-logos.sty \
texlive-dtk-bibliography"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear.bbx \
tex-dantelogo.sty \
tex-fetamont.sty \
tex-hologo.sty \
tex-iftex.sty \
tex-unicode-math.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
