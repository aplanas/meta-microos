SUMMARY = "Define commands that peek ahead in the input stream"
DESCRIPTION = "The package provides tools to help define commands that, like \
\\xspace and the LaTeX command \\textit, peek at what follows \
them in the command stream and choose appropriate behaviour."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn61719"

RPM_NAME = "texlive-xpeek-2023.201.0.0.2svn61719-52.1.noarch.rpm"
RPM_HASH = "14c4bd7e21ab35c235789e5a05d712f794940d89ee48f28248dbf53901ec2e8f15558de1c36499e56b220861b7a1c9e2f67fe4b4e4c84fa8be2ad8a1429b4fad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xpeek.sty \
texlive-xpeek"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
