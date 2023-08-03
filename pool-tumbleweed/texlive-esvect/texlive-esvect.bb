SUMMARY = "Vector arrows"
DESCRIPTION = "Write vectors using an arrow which differs from the Computer \
Modern one. You have the choice between several kinds of \
arrows. The package consists of the relevant Metafont code and \
a package to use it."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3svn32098"

RPM_NAME = "texlive-esvect-2023.209.1.3svn32098-53.1.noarch.rpm"
RPM_HASH = "d2f2d8f211b9dfadde0b66d96ea0c2b3366cc7a17cec72e3a9b3a06ca4c291d03df3c43dfb21ac255071b033f8f30c7e24ca8485a71f03fb07c8bc7233f7d2dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-esvect.map \
tex-esvect.sty \
tex-uesvect.fd \
tex-vect10.tfm \
tex-vect5.tfm \
tex-vect6.tfm \
tex-vect7.tfm \
tex-vect8.tfm \
tex-vect9.tfm \
texlive-esvect"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-esvect-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
