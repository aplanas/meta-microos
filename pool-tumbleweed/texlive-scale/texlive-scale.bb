SUMMARY = "Scale document by sqrt(2) or magstep(2)"
DESCRIPTION = "A package to scale a document by sqrt(2) (or by \\magstep{2}). \
This is useful if you are preparing a document on, for example, \
A5 paper and want to print on A4 paper to achieve a better \
resolution."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1.2svn15878"

RPM_NAME = "texlive-scale-2023.209.1.1.2svn15878-54.1.noarch.rpm"
RPM_HASH = "604f966a489057b1db8ded8c1c43a7b7487898b40dc6501e79506c3b2ddf2580fb58aaf37f7f55dcd9eac4496ac8c5b2dd05dd93c45bbf6365a18a13a0844192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scale.sty \
texlive-scale"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
