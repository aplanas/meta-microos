SUMMARY = "Writing 'configurations'"
DESCRIPTION = "In Stochastic Geometry and Digital Image Analysis some problems \
can be solved in terms of so-called 'configurations'. A \
configuration is basically a square matrix of \\circ and \\bullet \
symbols. This package provides a convenient and compact \
mechanism for displaying these configurations."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn15878"

RPM_NAME = "texlive-digiconfigs-2023.209.0.0.5svn15878-53.1.noarch.rpm"
RPM_HASH = "0df427be63b4e82a24575998dd889f421d4bb82bb51a44251828141a1598acd0d78464940a68d40872a6cd9f5191162bdd8d36ae663373540d799468c8980880"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-digiconfigs.sty \
texlive-digiconfigs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
