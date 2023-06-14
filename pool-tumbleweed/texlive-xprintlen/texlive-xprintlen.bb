SUMMARY = "Print TeX lengths in a variety of units"
DESCRIPTION = "The package defines a command, \\printlen, to print TeX lengths \
in a variety of units. It can handle all units supported by \
TeX. The package requires that a reasonably up to date version \
of the fp package be installed on you system."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35928"

RPM_NAME = "texlive-xprintlen-2023.201.1.0svn35928-52.1.noarch.rpm"
RPM_HASH = "00ac24dc338ad5546742f355451e23e81c32320a65857a5c72dbc869256d1420a697c278cbcace6a2d9fea1faaaec14f438d8aa1815bd81c3d725525baeda425"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xprintlen.sty \
texlive-xprintlen"

RDEPENDS:${PN} += "/bin/sh \
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
