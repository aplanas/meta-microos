SUMMARY = "Typeset CD covers"
DESCRIPTION = "The CD-cover class will typeset front and back cover sheets for \
CD jewel cases, or an entire paper cover, or a label for a \
plastic slip-cover."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn17121"

RPM_NAME = "texlive-cd-cover-2023.201.1.0svn17121-52.1.noarch.rpm"
RPM_HASH = "185a2fca82be91d5b3a3eb48d44a3a586b4133f969380869593e30c9bfc95a75b058ff3b62e30ed24b685b285fec06dc3cc2c1946b3fb27befc53228bf96898e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cd-cover.cls) \
texlive-cd-cover"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(article.cls) \
tex(rotating.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
