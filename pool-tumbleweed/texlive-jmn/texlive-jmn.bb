SUMMARY = "Special fonts for ConTeXt"
DESCRIPTION = "The jmn package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45751"

RPM_NAME = "texlive-jmn-2023.201.svn45751-55.1.noarch.rpm"
RPM_HASH = "e8a1b2de524b55264e005ec74bd715f11c52882194ed2e1898761fb49418a3492a828fad29ac20cbf347f06d237b2770848435a9061c810f0d0f31578ed79844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hans-sh.tfm \
tex-hans.enc \
tex-hans.map \
tex-hans.tfm \
texlive-jmn"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-jmn-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
