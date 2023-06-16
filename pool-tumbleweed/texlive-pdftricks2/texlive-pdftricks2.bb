SUMMARY = "Use PSTricks in pdfTeX"
DESCRIPTION = "The package provides the means of processing documents (that \
contain pstricks graphics specifications. The package is \
inspired by pdftricks"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.01svn31016"

RPM_NAME = "texlive-pdftricks2-2023.201.1.01svn31016-51.1.noarch.rpm"
RPM_HASH = "bd27e18e6d8c8168c8f0b76067b025604b5bee431e41016e6b14033be96dcdf78cc46c20985deb789a3b8925e8019219aa0089679350c98dcd7de9522e490d37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdftricks2.sty \
texlive-pdftricks2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-geometry.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifplatform.sty \
tex-moreverb.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
