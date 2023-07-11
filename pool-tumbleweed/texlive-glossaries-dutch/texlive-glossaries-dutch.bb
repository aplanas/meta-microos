SUMMARY = "Dutch language module for glossaries package"
DESCRIPTION = "Dutch language module for glossariesr package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn35685"

RPM_NAME = "texlive-glossaries-dutch-2023.201.1.1svn35685-53.2.noarch.rpm"
RPM_HASH = "a42f0313968c83c50524b1f886671362ad56ef267e0b7c980c75d733639e0bd8b4f46052f7a5879a58b9a9de63c5a9b4794d06b823be76f5b8bc1bd3e0e1e287"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-dutch.ldf \
texlive-glossaries-dutch"

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
