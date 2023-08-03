SUMMARY = "Typeset cards for Set"
DESCRIPTION = "The package will typeset cards for use in a game of Set."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.1svn40613"

RPM_NAME = "texlive-setdeck-2023.209.0.0.1svn40613-54.1.noarch.rpm"
RPM_HASH = "01ae872244f5e1939fc8a7a35a2a1504b288ec29fe24f484f55c1aaa07a632e70ac2544da70724cf3c4304a463c0c145b612d18f8a964ac9f8863cb0e8b94590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-setdeck.sty \
texlive-setdeck"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
