SUMMARY = "A build system for tex4ht"
DESCRIPTION = "make4ht is a simple build system for tex4ht, a TeX to XML \
converter. It provides a command line tool that drives the \
conversion process. It also provides a library which can be \
used to create customized conversion tools."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.3msvn66130"

RPM_NAME = "texlive-make4ht-2023.208.0.0.3msvn66130-53.1.noarch.rpm"
RPM_HASH = "25a9c922d4d89452a0514c93503b8a460e3905ff531a8ff415f22d57c5a6259d8e9ca00c86e739bc5ae14cfc75cf1c7a2b0092720bafddc868b9ed555a319e59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-make4ht"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-make4ht-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-tex4ht"

inherit rpm
