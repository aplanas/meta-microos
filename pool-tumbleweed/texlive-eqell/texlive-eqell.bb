SUMMARY = "Sympathetically spaced ellipsis after punctuation"
DESCRIPTION = "The package provides commands that give a well-spaced ellipsis \
after !, ?, !? or ?!."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn22931"

RPM_NAME = "texlive-eqell-2023.201.svn22931-53.2.noarch.rpm"
RPM_HASH = "eff47f93c7ecbfbfc6c2fbaf1be7363df5282fc27f99dfa05f0d7832112502436959617607503004d26659609700679cd47371f6c462d74711b4009d3755906e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eqell.sty \
texlive-eqell"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
