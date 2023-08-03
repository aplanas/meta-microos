SUMMARY = "Artificial Uncial font and LaTeX support macros"
DESCRIPTION = "The auncial-new bundle provides packages and fonts for a script \
based on the Artificial Uncial manuscript book-hand used \
between the 6th & 10th century AD. The script consists of \
minuscules and digits, with some appropriate period punctuation \
marks. Both normal and bold versions are provided, and the font \
is distributed in Adobe Type 1 format. This is an experimental \
new version of the auncial bundle, which is one of a series of \
bookhand fonts. The font follows the B1 encoding developed for \
bookhands. Access to the encoding is essential. The encoding \
mainly follows the standard T1 encoding."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn62977"

RPM_NAME = "texlive-auncial-new-2023.209.2.0svn62977-54.1.noarch.rpm"
RPM_HASH = "f3e10263569c9b19dc5e777a76bb3fe6cf024872b9668a8bd3c279b9a3f7d8bac0bd6cd115255f41217d733b6616403a128b7d155e433be04e041dd683bab94c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-allauncl.sty \
tex-auncial.map \
tex-auncial.sty \
tex-auncl10.tfm \
tex-aunclb10.tfm \
tex-b1auncl.fd \
texlive-auncial-new"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-auncial-new-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
