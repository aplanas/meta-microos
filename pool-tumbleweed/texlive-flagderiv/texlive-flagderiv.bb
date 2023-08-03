SUMMARY = "Flag style derivation package"
DESCRIPTION = "The flagderiv package is used to create mathematical \
derivations using the flag/flagpole notation. The package \
features an intuitive command syntax, opening and closing \
multiple flagpoles, different comment styles, customizable \
symbols and label namespaces."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.10svn15878"

RPM_NAME = "texlive-flagderiv-2023.209.0.0.10svn15878-53.1.noarch.rpm"
RPM_HASH = "da0d18e18dc2670381926f8821ca6c16e39f63746d5328c6ee4551acfd311976bab2eae9f9de54562a567efbab95e50d13b53e27315095bed8847aa62bdb9043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-flagderiv.sty \
texlive-flagderiv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-ifthen.sty \
tex-longtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
