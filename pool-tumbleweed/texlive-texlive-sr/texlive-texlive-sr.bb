SUMMARY = "TeX Live manual (Serbian)"
DESCRIPTION = "The texlive-sr package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54594"

RPM_NAME = "texlive-texlive-sr-2023.201.svn54594-54.1.noarch.rpm"
RPM_HASH = "2739ae65819dde1fd8838ac5711fc5b7ddb99ae5aecd678a7cbf4aebd80988f4c20a24f1d352a98e6b8c0c4f4f0db29135684961de32af7306ebb02b8956a3d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-sr"
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
