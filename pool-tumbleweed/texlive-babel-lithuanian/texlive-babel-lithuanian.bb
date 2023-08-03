SUMMARY = "Babel support for documents written in Lithuanian"
DESCRIPTION = "Babel support material for documents written in Lithuanian \
moved from the lithuanian package into a new package \
babel-lithuanian to match babel support for other languages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn66513"

RPM_NAME = "texlive-babel-lithuanian-2023.209.1.0svn66513-54.1.noarch.rpm"
RPM_HASH = "412739e74f0066b914b8a66090b7577e332803c871f391d497e1bbdc91cbdfd5b8adc245fff49e4b5fb6ab4f92cef2f96bee96955226380ee23e9bfdd960dd29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lithuanian.ldf \
texlive-babel-lithuanian"

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
