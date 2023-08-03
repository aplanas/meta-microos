SUMMARY = "TeX Live manual (Serbian)"
DESCRIPTION = "The texlive-sr package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54594"

RPM_NAME = "texlive-texlive-sr-2023.209.svn54594-55.1.noarch.rpm"
RPM_HASH = "fe90e1c943f7a4106113c773121faaa945b3380fc4ad52a50dcb0c8b8d9b28fca66fcb5a9b94c57511c39b1c80e6d8f3a45280eb2eeed7131e3541c861786384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-sr"

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
