SUMMARY = "Add notes on document development"
DESCRIPTION = "The package provides tools to highlight FIXME and TODO \
annotations. The command \\listofnotes prints a list of \
outstanding notes, with links to the pages on which they \
appear."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.2.2svn30168"

RPM_NAME = "texlive-fixmetodonotes-2023.209.0.0.2.2svn30168-53.1.noarch.rpm"
RPM_HASH = "52afd5858b6aa1a86010efbb292bd8f52063de10ec46ea477dff7c292d698bdff62a1caa3ab4ff21a3867ab1c50f0b16f726e0ecb03eea152ae455ef71fe086e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fixmetodonotes.sty \
texlive-fixmetodonotes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-fix-cm.sty \
tex-graphicx.sty \
tex-tocloft.sty \
tex-transparent.sty \
tex-ulem.sty \
tex-watermark.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
