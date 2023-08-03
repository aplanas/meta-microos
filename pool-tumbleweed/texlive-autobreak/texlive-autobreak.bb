SUMMARY = "Simple line breaking of long formulae"
DESCRIPTION = "This package implements a simple mechanism of line/page \
breaking within the align environment of the amsmath package; \
new line characters are considered as possible candidates for \
the breaks and the package tries to put breaks at adequate \
places. It is suitable for computer-generated long formulae \
with many terms."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn43337"

RPM_NAME = "texlive-autobreak-2023.209.0.0.3svn43337-54.1.noarch.rpm"
RPM_HASH = "26f84b46afa94b58fe4a865777de93340d42529e5c67124d81fa3024de93e703a1772765b3e3026a854bf6b98cbc634f63b91ff6643d110257448cddd831ed92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-autobreak.sty \
texlive-autobreak"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-catchfile.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
