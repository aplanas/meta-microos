SUMMARY = "Cuprum font family support for LaTeX"
DESCRIPTION = "This package provides support for the Cuprum font family (see \
http://jovanny.ru)."
LICENSE = "OFL-1.1"

PV = "2023.204.svn49909"

RPM_NAME = "texlive-cuprum-2023.204.svn49909-54.1.noarch.rpm"
RPM_HASH = "22e624ed19b0be5b03b6f8b620cfccb1645c29a3b2beac0bf34830f9f28f1d657ceab55e9be60583f031e0e7dd12840935a63731999b253b6dc2c5d0cfc65cd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cprbit8t.tfm \
tex-cprbn8t.tfm \
tex-cprmit8t.tfm \
tex-cprmn8t.tfm \
tex-cuprum.map \
tex-cuprum.sty \
tex-t1cpr.fd \
texlive-cuprum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-cuprum-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
