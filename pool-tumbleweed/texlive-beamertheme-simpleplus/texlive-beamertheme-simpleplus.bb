SUMMARY = "A simple and clean theme for LaTeX beamer"
DESCRIPTION = "This package provides a simple and clean theme for LaTeX \
Beamer. It can be used for academic and scientific \
presentations."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn64770"

RPM_NAME = "texlive-beamertheme-simpleplus-2023.209.1.0svn64770-54.1.noarch.rpm"
RPM_HASH = "c27e029e47e93bb1a1c5d4abaaeabfef7745f733d9fcea3c7dd97d2a5ffcc3dc3e261d8dee479cd4079acb311ccbec34e50619408b310ac8f1c2f4f317de5f57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeSimplePlus.sty \
tex-beamerfontthemeSimplePlus.sty \
tex-beamerinnerthemeSimplePlus.sty \
tex-beamerthemeSimplePlus.sty \
texlive-beamertheme-simpleplus"

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
