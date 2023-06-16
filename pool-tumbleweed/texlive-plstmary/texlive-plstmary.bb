SUMMARY = "St. Mary's Road font support for plain TeX"
DESCRIPTION = "The package provides commands to produce all the symbols of the \
St Mary's Road fonts, in a Plain TeX environment."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.5csvn31088"

RPM_NAME = "texlive-plstmary-2023.201.0.0.5csvn31088-52.1.noarch.rpm"
RPM_HASH = "56f30f554d426539f585208503201d4631eaf23e567254255733bb7e8edda62ba1d40738879b7d86c516596e2a00b83812086cb1ed28d9868097c4e2143585a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-stmary.tex \
texlive-plstmary"

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
