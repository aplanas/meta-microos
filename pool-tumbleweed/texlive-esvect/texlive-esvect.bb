SUMMARY = "Vector arrows"
DESCRIPTION = "Write vectors using an arrow which differs from the Computer \
Modern one. You have the choice between several kinds of \
arrows. The package consists of the relevant Metafont code and \
a package to use it."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3svn32098"

RPM_NAME = "texlive-esvect-2023.201.1.3svn32098-52.1.noarch.rpm"
RPM_HASH = "1e379d8a2284cabca4c4f500d920b97bff320a26ebf95cd68d7211f5b515202caf5b3b90429dc079287ddb8550d23832a468b41bcdaf7724f3928ca531133618"
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

RDEPENDS:${PN} += "/bin/sh \
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
