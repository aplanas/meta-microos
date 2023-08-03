SUMMARY = "Babel module to support Serbian Cyrillic"
DESCRIPTION = "The package provides support for Serbian documents written in \
Cyrillic, in babel."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2asvn64588"

RPM_NAME = "texlive-babel-serbianc-2023.209.3.2asvn64588-54.1.noarch.rpm"
RPM_HASH = "cd45b40fd1c39d99f9454e58e81d5531f0878a3e9edf83c461aeda173be14f3be20d01a32f17f4ad0dbbd1b1273f6957e71015f73f52b94a695852e75addb90b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-serbianc.ldf \
texlive-babel-serbianc"

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
