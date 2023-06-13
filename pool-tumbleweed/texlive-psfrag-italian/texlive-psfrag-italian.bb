SUMMARY = "PSfrag documentation in Italian"
DESCRIPTION = "This is a translation of the documentation that comes with the \
psfrag documentation."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-psfrag-italian-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "851af3ec250ab3b41d6a6df45eff217d7774358dd4f6e49d5d891bd774006e0827e50455b4888b5cb7c9d36943bc076f09c6b8a4ae21eb23e921af315d7c35a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-psfrag-italian"

RDEPENDS:${PN} += "/bin/sh \
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
