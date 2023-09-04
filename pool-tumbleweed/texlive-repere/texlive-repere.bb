SUMMARY = "MetaPost macros for secondary school mathematics teachers"
DESCRIPTION = "This package provides MetaPost macros for drawing secondary \
school mathematics figures in a coordinate system: axis, grids \
points, vectors functions (curves, tangents, integrals, \
sequences) statistic diagrams plane geometry (polygons, \
circles) arrays and game boards"
LICENSE = "LPPL-1.0"

PV = "2023.209.23.02svn65769"

RPM_NAME = "texlive-repere-2023.209.23.02svn65769-54.2.noarch.rpm"
RPM_HASH = "c0acf247df4caafad8856534e60bb428ae3c00df3a09fa7344c8613f72d5a8437c544ae9a696320c1ebca56923ee39a72c2b459807f1b206c7c07412743a8054"
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
