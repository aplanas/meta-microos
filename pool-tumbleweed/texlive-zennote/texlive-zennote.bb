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

RPM_NAME = "texlive-zennote-2023.209.1.0.0svn65549-53.2.noarch.rpm"
RPM_HASH = "cd91efc0a47d120acdbc64bd56937372c582dc8ecf59353bc680d0466bcf9e5170c43e72f0f816461a3d08fa60909efda8ab548cfa5af6362f8ddab8aa2211d1"
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
