SUMMARY = "Wrapper to use the correct libertinus package according to the used TeX engine"
DESCRIPTION = "This package is only a wrapper for the two packages \
libertinus-type1 (pdfLaTeX) and libertinus-otf \
(LuaLaTeX/XeLaTeX). The Libertinus fonts are similiar to \
Libertine and Biolinum, but come with math symbols."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn61719"

RPM_NAME = "texlive-libertinus-2023.209.0.0.02svn61719-55.1.noarch.rpm"
RPM_HASH = "dea4185e8c664e29d46c046f72506ff22a56ba0caffa053e8d45ea631a3cc59c36f0dc98cf9ade7a4313686ba3a7d186f5f5462bcb926812d1c7664cfd86a30b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-libertinus.sty \
texlive-libertinus"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
