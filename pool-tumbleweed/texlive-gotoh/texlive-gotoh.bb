SUMMARY = "An implementation of the Gotoh sequence alignment algorithm"
DESCRIPTION = "This package calculates biological sequence alignment with the \
Gotoh algorithm. The package also provides an interface to \
control various settings including algorithm parameters."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn44764"

RPM_NAME = "texlive-gotoh-2023.201.1.1svn44764-53.2.noarch.rpm"
RPM_HASH = "f7ebebc6b5c8f5babbfec7a41aa1937511797ed36f0be5f4ba289992fbec0cdba5f88c981ae2ac4ed35571fefacc3296445a44dedf4b7838878a5bacafd45df3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gotoh.sty \
texlive-gotoh"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
