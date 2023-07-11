SUMMARY = "Print TeX lengths in a variety of units"
DESCRIPTION = "The package defines a command, \\printlen, to print TeX lengths \
in a variety of units. It can handle all units supported by \
TeX. The package requires that a reasonably up to date version \
of the fp package be installed on you system."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35928"

RPM_NAME = "texlive-xprintlen-2023.201.1.0svn35928-52.2.noarch.rpm"
RPM_HASH = "b80225d4a1ddea2b4b190d54b6a938cf299ebfed0fcb94e2a1228c0c591465722efe1fa9490b0bc330c2acec7fae4b0dc0494254177d8aa32bee28f6a9a95bd5"
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
