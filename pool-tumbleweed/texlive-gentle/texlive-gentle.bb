SUMMARY = "A Gentle Introduction to TeX"
DESCRIPTION = "The 'Gentle Introduction' is the longest-established \
comprehensive free tutorial on the use of plain TeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-gentle-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "06245c5ee4615be62cabe9323f4666d107221c1418789d3dfa244bb163fa8acaf01437acce8c3e95ec77e925a2f71b0bbeedc76f91a19863de969e6711a4a3c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gentle"

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
