SUMMARY = "Add notes on document development"
DESCRIPTION = "The package provides tools to highlight FIXME and TODO \
annotations. The command \\listofnotes prints a list of \
outstanding notes, with links to the pages on which they \
appear."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.2.2svn30168"

RPM_NAME = "texlive-fixmetodonotes-2023.201.0.0.2.2svn30168-52.1.noarch.rpm"
RPM_HASH = "047d0f6bfc19d74cbb88ea57a5942900c6284574f529aa0923d007a7216adf9817f4cb421fe450ec0828c84835138c5c296b1bef14672c32f41bacc6020b4cdf"
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
