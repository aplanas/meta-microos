SUMMARY = "Fixed-font code blocks formatted nicely"
DESCRIPTION = "This LaTeX package helps you write source code in your academic \
papers and make it looks neat. It uses minted and tcolorbox, \
configuring them the right way, to ensure that code fragments \
and code blocks look nicer."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8.0svn65170"

RPM_NAME = "texlive-ffcode-2023.209.0.0.8.0svn65170-53.1.noarch.rpm"
RPM_HASH = "6feeed4e5c7267453ab36d22ded41479fe34b8981a47d63a09dfcd0c1a83b07fd5a574787ee9e4cb4f8e1cc2afa89a5c8de22cd86f264655dda027fa25fb947c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ffcode.sty \
texlive-ffcode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-minted.sty \
tex-pgfopts.sty \
tex-tcolorbox.sty \
texlive \
texlive-environ \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-microtype \
texlive-minted \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin \
texlive-tcolorbox \
texlive-xkeyval"

inherit rpm
