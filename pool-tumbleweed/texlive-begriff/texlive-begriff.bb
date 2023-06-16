SUMMARY = "Typeset Begriffschrift"
DESCRIPTION = "The package defines maths mode commands for typesetting Frege's \
Begriffschrift."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.6svn15878"

RPM_NAME = "texlive-begriff-2023.201.1.6svn15878-53.1.noarch.rpm"
RPM_HASH = "dcd6b8d2fd0ac246737efd57cae87cbc4f7ad176e0364262d28380acf34e2cc307d5bcad61e7fe27e52598a3854bc46c837a4b1a9f0222290e9afebdcc04d8a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-begriff.sty \
texlive-begriff"

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
