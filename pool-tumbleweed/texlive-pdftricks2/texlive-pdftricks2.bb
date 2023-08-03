SUMMARY = "Use PSTricks in pdfTeX"
DESCRIPTION = "The package provides the means of processing documents (that \
contain pstricks graphics specifications. The package is \
inspired by pdftricks"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.01svn31016"

RPM_NAME = "texlive-pdftricks2-2023.209.1.01svn31016-52.1.noarch.rpm"
RPM_HASH = "aba119197bf9d5ea44204b92642bdcfb39f88e78bb41c9bdd54bdd111343e0f710cf54d365ad06f41b44d19169bb6c5b1fe8ac791c5bda7a271f3a1029758fdf"
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
