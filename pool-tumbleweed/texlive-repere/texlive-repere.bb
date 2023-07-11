SUMMARY = "MetaPost macros for secondary school mathematics teachers"
DESCRIPTION = "This package provides MetaPost macros for drawing secondary \
school mathematics figures in a coordinate system: axis, grids \
points, vectors functions (curves, tangents, integrals, \
sequences) statistic diagrams plane geometry (polygons, \
circles) arrays and game boards"
LICENSE = "LPPL-1.0"

PV = "2023.201.23.02svn65769"

RPM_NAME = "texlive-repere-2023.201.23.02svn65769-53.2.noarch.rpm"
RPM_HASH = "dfa8a6677d796c29004ff8818d6d6f4052a06a86593198d9af5e8ba04bd1c3e413d7b1748a94215a94c9d8e01e3c40f493a28fbc69be001fad4c049949c17e5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-repere"

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
