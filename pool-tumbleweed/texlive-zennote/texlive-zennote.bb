SUMMARY = "Streamline your note-taking process!"
DESCRIPTION = "This package aims to provide you with an easy interface to \
speed up the process when organizing and producing elegant \
notes. All the tables, figures, equations, and listings are \
labelled according to the notenumber with the \\titlebox \
command. The noteframe environment helps you generate fancy \
colored boxes to emphasize the important information (e.g. \
Theorems, Equations, Proofs, etc.) in your document. You can \
customize the style and color to denote different categories, \
too."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn65549"

RPM_NAME = "texlive-zennote-2023.209.1.0.0svn65549-53.1.noarch.rpm"
RPM_HASH = "7eaa7db00410286f1e4398d9501eaae1713140a9984e93ed4fcc29e6fcb26028dcdb139d7b4ee670fdf6c73ae7327a154edc4e7d2210cb1d21fd51afe26803d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zennote.sty \
texlive-zennote"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tcolorbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
