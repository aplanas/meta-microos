SUMMARY = "The Green Point logo"
DESCRIPTION = "A Metafont-implementation of the logo commonly known as 'Der \
Grune Punkt' ('The Green Point'). In Austria, it can be found \
on nearly every bottle. It should not be confused with the \
'Recycle'-logo, implemented by Ian Green."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-greenpoint-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "20ce1db815395f55adf08c7f48656ea66526b32df0fa4c43964b9badb07b55c9bffab399dca19213ce55ce545dbae372da3761457261c635838f766d08b114c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-greenpoint.tfm \
texlive-greenpoint"

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
