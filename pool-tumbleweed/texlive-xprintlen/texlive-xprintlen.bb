SUMMARY = "Print TeX lengths in a variety of units"
DESCRIPTION = "The package defines a command, \\printlen, to print TeX lengths \
in a variety of units. It can handle all units supported by \
TeX. The package requires that a reasonably up to date version \
of the fp package be installed on you system."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35928"

RPM_NAME = "texlive-xprintlen-2023.209.1.0svn35928-53.1.noarch.rpm"
RPM_HASH = "d4261de7419768339f803310a36857f756971f9831301297f69c3d45574cd2f77de79b45cc1b67d48c8dd1be0547551b08733411a73d26dea5b0257c622f104f"
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
