SUMMARY = "A Russian translation of the MetaPost manual"
DESCRIPTION = "A translation of the user manual, as distributed with MetaPost \
itself."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.004svn15878"

RPM_NAME = "texlive-mpman-ru-2023.209.1.004svn15878-55.1.noarch.rpm"
RPM_HASH = "6cb5380d4618a229e06768461378e6bdb7ce05d490c2ae143e8681c256514d98d24c389bd9cd7f1774497784596c1063505e0aa416551d77008c03d1602dc0c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mpman-ru"

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
