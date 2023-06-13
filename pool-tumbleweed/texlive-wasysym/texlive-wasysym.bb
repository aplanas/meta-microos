SUMMARY = "LaTeX support for the wasy fonts"
DESCRIPTION = "The wasy (Waldi Symbol) font by Roland Waldi provides many \
glyphs like male and female symbols and astronomical symbols, \
as well as the complete lasy font set and other odds and ends. \
This package implements an easy to use interface for these \
symbols."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.4svn54080"

RPM_NAME = "texlive-wasysym-2023.201.2.4svn54080-53.1.noarch.rpm"
RPM_HASH = "dcd2e1c82f6ede6dbbaff61b1e82003f33e5af986852726271b42c186185b8e0d7b9ee4b14e463b1c5335dcd5caf4a5380579bc5a6921dd0d85d356d745225aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(uwasy.fd) \
tex(uwasyvar.fd) \
tex(wasysym.sty) \
texlive-wasysym"

RDEPENDS:${PN} += "/bin/sh \
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
