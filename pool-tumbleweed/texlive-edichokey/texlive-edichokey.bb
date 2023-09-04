SUMMARY = "Typeset dichotomous identification keys"
DESCRIPTION = "This is a LaTeX package for typesetting dichotomous \
identification key in indented style. It can be considered as \
an extended version of package dichokey, as edichokey is more \
capable of dealing with complex keys."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.01ysvn56223"

RPM_NAME = "texlive-edichokey-2023.209.2.01ysvn56223-54.2.noarch.rpm"
RPM_HASH = "9ad8a6673a569faeb16102044d93da94a6807fd300bfbb718cdaaee5c360c822532234be04dd816317c5f53c88ba6dc0830affe34cfa26f47177af1c762466d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-edichokey.sty \
texlive-edichokey"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
