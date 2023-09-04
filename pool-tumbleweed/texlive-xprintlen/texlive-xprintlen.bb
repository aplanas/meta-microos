SUMMARY = "Print TeX lengths in a variety of units"
DESCRIPTION = "The package defines a command, \\printlen, to print TeX lengths \
in a variety of units. It can handle all units supported by \
TeX. The package requires that a reasonably up to date version \
of the fp package be installed on you system."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35928"

RPM_NAME = "texlive-xprintlen-2023.209.1.0svn35928-53.2.noarch.rpm"
RPM_HASH = "524582a0668ec08ede0cb8cbb6f5db5aeeba81a8d35ac459393d77b876633fc8bcee8ea1ea82df3bb5243a2f7c79f09fd156286089cdd02e5bf09b6918d773ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xprintlen.sty \
texlive-xprintlen"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
