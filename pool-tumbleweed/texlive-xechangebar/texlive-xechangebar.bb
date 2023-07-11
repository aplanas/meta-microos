SUMMARY = "An extension of package changebar that can be used with XeLaTeX"
DESCRIPTION = "The package extends package changebar so it can be used with \
XeLaTeX. It introduces the new option xetex for use with \
XeLaTeX. Everything else remains the same and users should \
consult the original documentation for usage information."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn54080"

RPM_NAME = "texlive-xechangebar-2023.201.1.0svn54080-52.2.noarch.rpm"
RPM_HASH = "1e590cd6e3ad7cf2ee3f2c523f87341c3ea961221f11c726e9f594c99fc6ee0e0fec4439b43c95372cd7843f79a4e147ccb2a9fa14fbeb9888c6cbc966f0a533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xechangebar.sty \
texlive-xechangebar"

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
