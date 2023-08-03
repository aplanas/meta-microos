SUMMARY = "Typeset CD covers"
DESCRIPTION = "The CD-cover class will typeset front and back cover sheets for \
CD jewel cases, or an entire paper cover, or a label for a \
plastic slip-cover."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn17121"

RPM_NAME = "texlive-cd-cover-2023.209.1.0svn17121-53.1.noarch.rpm"
RPM_HASH = "068650d94406b5cfa55411fe92d7f4eef2eebaaa4c70e4c21c27328dddf8c5eb3a932465284c0c4f001d34072de1fa0e76f40f043dc5c4fe50c77f8f21c22b75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cd-cover.cls \
texlive-cd-cover"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-rotating.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
