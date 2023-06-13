SUMMARY = "A Java rendering library based on JoGL"
DESCRIPTION = "SciRenderer is a rendering library based on JoGL. This Java API allows \
2-D or 3-D plotting from simple 2-D graph to complex scenes. Independent \
library, SciRender is used within Scilab software but is available \
for other application and developments."
LICENSE = "CECILL-2.0"

PV = "1.1.0"

RPM_NAME = "scirenderer-1.1.0-6.6.noarch.rpm"
RPM_HASH = "da3e3ad3661b67ef842811b3bc5572942a24e5ed7ec000c1bb272a0bcd6988b84384beb21b944df3e5a10875e61df40b5984f6b1d1ee79fe8e6d8158084c5be4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scirenderer"

RDEPENDS:${PN} += "java \
jpackage-utils"

inherit rpm
