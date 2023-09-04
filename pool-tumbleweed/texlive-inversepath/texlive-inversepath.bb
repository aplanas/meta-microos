SUMMARY = "Calculate inverse file paths"
DESCRIPTION = "The package calculates inverse relative paths. Such things may \
be useful, for example, when writing an auxiliary file to a \
different directory."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-inversepath-2023.209.0.0.2svn15878-54.1.noarch.rpm"
RPM_HASH = "480c2d3f3d33a8adfd1449d19de914fc92a2fc8ddb6ef0c2f414f5721bad4d56a7d476c7af6183bfa7319787ce996711c8fa768e0ad5c66ab36948e4626e08e2"
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
