SUMMARY = "Estonian introduction to LaTeX"
DESCRIPTION = "This is the Estonian translation of Short Introduction to \
LaTeX2e."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.5.05svn39323"

RPM_NAME = "texlive-lshort-estonian-2023.209.5.05svn39323-55.1.noarch.rpm"
RPM_HASH = "d349c5b403167e047cc51079c790c32e14b5a28747dca42f5020075141a678f14495ede7dc2795abd859fc8f0fb006465c1e1e811887a626aa18d30a51cf0bb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-estonian"

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
