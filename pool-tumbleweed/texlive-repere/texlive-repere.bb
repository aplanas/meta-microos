SUMMARY = "MetaPost macros for secondary school mathematics teachers"
DESCRIPTION = "This package provides MetaPost macros for drawing secondary \
school mathematics figures in a coordinate system: axis, grids \
points, vectors functions (curves, tangents, integrals, \
sequences) statistic diagrams plane geometry (polygons, \
circles) arrays and game boards"
LICENSE = "LPPL-1.0"

PV = "2023.201.23.02svn65769"

RPM_NAME = "texlive-repere-2023.201.23.02svn65769-53.1.noarch.rpm"
RPM_HASH = "d6c19c13ba814e2478a9d999790d4e6b8f523f797382b75bcc75aa2e0b44975650487fe4006f380d6be630d7d03b33fcd3bfd23f3d25010e49e5a7d5b3fc719f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-repere"
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
