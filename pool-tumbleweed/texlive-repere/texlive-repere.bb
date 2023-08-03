SUMMARY = "MetaPost macros for secondary school mathematics teachers"
DESCRIPTION = "This package provides MetaPost macros for drawing secondary \
school mathematics figures in a coordinate system: axis, grids \
points, vectors functions (curves, tangents, integrals, \
sequences) statistic diagrams plane geometry (polygons, \
circles) arrays and game boards"
LICENSE = "LPPL-1.0"

PV = "2023.209.23.02svn65769"

RPM_NAME = "texlive-repere-2023.209.23.02svn65769-54.1.noarch.rpm"
RPM_HASH = "54689ccc15656baf2e923df7ff866287d93d19f99607e0b354055fc707eead5a3af132598c3f37134dfa7d80dcacd4428a6fc9dfd564cc8c3e882375b1cac615"
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
