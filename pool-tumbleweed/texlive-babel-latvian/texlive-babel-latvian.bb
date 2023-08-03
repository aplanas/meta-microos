SUMMARY = "Babel support for Latvian"
DESCRIPTION = "The package provides the language definition file for support \
of Latvian in babel."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0bsvn46681"

RPM_NAME = "texlive-babel-latvian-2023.209.2.0bsvn46681-54.1.noarch.rpm"
RPM_HASH = "d4235163e8eb7f5bce08679a005a72d14479d761183ede69ed99366f1e4a4feef5cf212accc5df45e0c7ac7c7f6fd4e159c21d46e749f527f72ec8cde3d79dfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-latvian.ldf \
texlive-babel-latvian"

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
