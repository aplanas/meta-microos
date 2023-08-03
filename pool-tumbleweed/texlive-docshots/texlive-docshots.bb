SUMMARY = "TeX samples next to their PDF Snapshots"
DESCRIPTION = "This LaTeX package helps you show TeX code next to the \
corresponding PDF snapshots, in two-column formatting. You can \
use it either in .dtx documentation or in .tex files."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.0svn65141"

RPM_NAME = "texlive-docshots-2023.209.0.0.4.0svn65141-53.1.noarch.rpm"
RPM_HASH = "09048c8085ef4ae9ec1da4997426d4e31ccafd37c23f8e3bccfc9b09ee2d92e56d6ac0874c3d5274f8377d8e6f229b3e93ea6f01752035331121e3e6ced12fe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-docshots.sty \
texlive-docshots"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyvrb.sty \
tex-graphicx.sty \
tex-iexec.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-pdftexcmds.sty \
tex-pgfopts.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-fancyvrb \
texlive-filesystem \
texlive-iexec \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pdfcrop \
texlive-pgf \
texlive-pgf-blur \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
