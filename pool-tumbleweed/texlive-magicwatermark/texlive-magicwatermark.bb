SUMMARY = "An easy and flexible way to set watermarks"
DESCRIPTION = "This package can flexibly set and clear watermarks. It is based \
on everypage and TikZ, encapsulated by LaTeX3. All watermark \
content is placed inside a TikZ node in the center of the page."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0.1svn63656"

RPM_NAME = "texlive-magicwatermark-2023.208.1.0.1svn63656-53.1.noarch.rpm"
RPM_HASH = "c466d7899c962965232b846bba53d1a7994a369d4ed0db9fb548c412aa6c66ab8de16be30f85359e40e5ade3f29fb424d1ebb231981a9217ae7088ee0d5b15ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-magicwatermark.sty \
texlive-magicwatermark"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everypage-1x.sty \
tex-expl3.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
