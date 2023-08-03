SUMMARY = "Warn for split footnotes"
DESCRIPTION = "This package detects footnotes that are split over several \
pages, and writes a warning to the log file."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.30svn25003"

RPM_NAME = "texlive-fnbreak-2023.209.1.30svn25003-53.1.noarch.rpm"
RPM_HASH = "f1c3d866e8e07bbc77717fabe3571d597e1570323121128cd7bc23fe0dbc529e366a85b3ef7c598cde12b34ae595dde91f506defcf811272138dce1273ecfd5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fnbreak.sty \
texlive-fnbreak"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
