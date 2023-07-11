SUMMARY = "Calculate inverse file paths"
DESCRIPTION = "The package calculates inverse relative paths. Such things may \
be useful, for example, when writing an auxiliary file to a \
different directory."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.2svn15878"

RPM_NAME = "texlive-inversepath-2023.208.0.0.2svn15878-53.1.noarch.rpm"
RPM_HASH = "3d7846d47de7ad6dc0b284db0965532f666a45f20bc61079e4ea717a67eb50a92a363dc739c97c123123c8972d2357fd6c90391fcbd48d0da907e1bfdd38d344"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-inversepath.sty \
texlive-inversepath"

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
