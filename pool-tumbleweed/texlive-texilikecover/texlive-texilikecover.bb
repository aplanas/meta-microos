SUMMARY = "A cover-page package, like TeXinfo"
DESCRIPTION = "The package creates document cover pages, like those that \
TeXinfo produces."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn15878"

RPM_NAME = "texlive-texilikecover-2023.209.0.0.1svn15878-55.1.noarch.rpm"
RPM_HASH = "ca10feb7861593bffd6df51c1bd3bec1c1f9ec1b008e3df1d07f4786949bbda9fdebba1b0d33974a082df6e3fdd1c54f238365c337af748c7354a7cacf76336d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texilikecover.sty \
texlive-texilikecover"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
