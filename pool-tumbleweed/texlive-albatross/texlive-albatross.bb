SUMMARY = "Find fonts that contain a given glyph"
DESCRIPTION = "This is a command line tool for finding fonts that contain a \
given (Unicode) glyph. It relies on Fontconfig."
LICENSE = "BSD-3-Clause"

PV = "2023.209.0.0.5.0svn65647"

RPM_NAME = "texlive-albatross-2023.209.0.0.5.0svn65647-55.1.noarch.rpm"
RPM_HASH = "3a7d0eb49096c5ac3afab0e51085831aa0b808e04f621a1e4d7892a4fbdde1ac73d92b3298643beab3373a9feaf82f9cf5af0f469d93e29bbbecd142c22a1d05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-albatross.jar \
texlive-albatross"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
java \
sed \
texlive \
texlive-albatross-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
