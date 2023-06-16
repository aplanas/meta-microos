SUMMARY = "Writing big integrals"
DESCRIPTION = "The package provides facilities for drawing big integral signs \
when needed. An example would be when the integrand is a \
matrix."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn29803"

RPM_NAME = "texlive-bigints-2023.201.svn29803-53.1.noarch.rpm"
RPM_HASH = "5eedf5d66d38ce2db211faf8df1aa9d82414625ce9c2a790c76a5a027cca2b005a2892a9c7ac905bf40580c2c8a0424d37234b69bec165fde8e0cf56bba806a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bigints.sty \
texlive-bigints"

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
