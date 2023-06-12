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

RPM_NAME = "texlive-zennote-2023.201.1.0.0svn65549-52.1.noarch.rpm"
RPM_HASH = "86cd88e4cdd13d8f055fd066701270d888a4914ea0025271612ab0d4af0d886459ffdf9f1bf7881cc3c828edee0738f36170261609b43012de6f4fa15cac6e09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(zennote.sty) \
texlive-zennote"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(tcolorbox.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
