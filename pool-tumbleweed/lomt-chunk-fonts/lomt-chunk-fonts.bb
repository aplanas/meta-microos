SUMMARY = "League Of Movable Type's 'Chunk' font"
DESCRIPTION = "'Chunk' is an ultra-bold slab serif typeface that is reminiscent of \
old American Western woodcuts, broadsides, and newspaper headlines. \
Used mainly for display, the fat block lettering is unreserved yet \
refined for contemporary use."
LICENSE = "OFL-1.1"

PV = "0.20121218"

RPM_NAME = "lomt-chunk-fonts-0.20121218-8.7.noarch.rpm"
RPM_HASH = "045ee2ab30413f945faab12e1dd6b4c705dd16b25ec9c16d39f5814548cd1bb49878d2fbcd7ca419ce7bd32609d116208b5a34098151a7a2635f2e320e294f6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-chunk-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
