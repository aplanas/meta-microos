SUMMARY = "Extensions to the LaTeX NFSS"
DESCRIPTION = "The package is a development of nfssext.sty, distributed with \
the examples for the font installation guide. The package has \
been developed for use in packages such as cfr-lm and \
venturisadf,"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn43640"

RPM_NAME = "texlive-nfssext-cfr-2023.209.svn43640-55.1.noarch.rpm"
RPM_HASH = "c26da4e9a5ee7575f802a28097b9a5aa46d02c890efb82e201272bc33e6d85d82b4d1415f4e8c9802b442d177eec206289dc51a0b65d445f05fae3713a66116f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nfssext-cfr.sty \
texlive-nfssext-cfr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-svn-prov.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
