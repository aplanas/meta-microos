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

PV = "2023.201.1.0.0svn65549"

RPM_NAME = "texlive-zennote-2023.201.1.0.0svn65549-52.2.noarch.rpm"
RPM_HASH = "cd6e2d87d50f6935ec0311b2758abe5f8949822e539f7a9c0ffe2f5b6fce090ddf0bc3b6d0aef63b763f1f7d94525746d537484c51a6af832b8a557d89ef37e0"
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
