SUMMARY = "Extended TeX"
DESCRIPTION = "An development of omega, using most of the extensions of TeX \
itself developed for e-TeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn66203"

RPM_NAME = "texlive-aleph-2023.201.svn66203-54.1.noarch.rpm"
RPM_HASH = "29a801e41e17f502ce6e3f3c2467792ad4c3aa5e066794491d4153c9a0c03a8df91d1831bd5aae8182bfe6143adedfe481c593c4d746d595726ef857aea7141d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-aleph.1 \
texlive-aleph"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-aleph-bin \
texlive-cm \
texlive-filesystem \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lambda \
texlive-latex \
texlive-plain \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
