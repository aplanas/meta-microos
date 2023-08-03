SUMMARY = "Cuprum font family support for LaTeX"
DESCRIPTION = "This package provides support for the Cuprum font family (see \
http://jovanny.ru)."
LICENSE = "OFL-1.1"

PV = "2023.209.svn49909"

RPM_NAME = "texlive-cuprum-2023.209.svn49909-55.1.noarch.rpm"
RPM_HASH = "f768ce5d6ba038ee0a99735e51fbfbce44ab6c304b2582ba01c2ed39f62c4be3b23743a73c0b3c433c8bef53aab55e5357ab31714da17c70b9808fed37b10670"
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
