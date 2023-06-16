SUMMARY = "Aids for typesetting simple verse"
DESCRIPTION = "The package documentation discusses approaches to the problem; \
the package is strong on layout, from simple alternate-line \
indentation to the Mouse's tale from Alice in Wonderland."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.4bsvn34017"

RPM_NAME = "texlive-verse-2023.201.2.4bsvn34017-53.1.noarch.rpm"
RPM_HASH = "f5ef861b8a0b691dc6c89efc0d275c0e19e878ce283262eda7a55f1bd0e408b57b68f82f6a0991c46b465d5856fe9b69d63ee4543b5c9836f15b0b173f5323b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-verse.sty \
texlive-verse"

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
