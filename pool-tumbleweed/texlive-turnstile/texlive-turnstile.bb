SUMMARY = "Typeset the (logic) turnstile notation"
DESCRIPTION = "Among other uses, the turnstile sign is used by logicians for \
denoting a consequence relation, related to a given logic, \
between a collection of formulas and a derived formula."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn64967"

RPM_NAME = "texlive-turnstile-2023.201.1.0svn64967-52.1.noarch.rpm"
RPM_HASH = "d5769331d8b26d0a00bd4fb6af9ab5088deb12433520eec17260cd9b6a4c341193fe1b390db3d2c8bf6ebef6c5034b41d594eda56824501d99d7612dc94a0225"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-turnstile.sty \
texlive-turnstile"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
