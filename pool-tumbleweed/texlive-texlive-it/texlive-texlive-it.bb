SUMMARY = "TeX Live manual (Italian)"
DESCRIPTION = "The texlive-it package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58653"

RPM_NAME = "texlive-texlive-it-2023.201.svn58653-54.1.noarch.rpm"
RPM_HASH = "a7e7267c501d5e4c4ec0c64c9793a308df87db1a98f0e99445c855092ce142f7638a22d1ad81f7dc059e0552b0646be26ac684e136cbd9ae864df08ab8c83109"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-it"

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
