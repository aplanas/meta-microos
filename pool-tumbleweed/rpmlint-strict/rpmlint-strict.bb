SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230727.0fd5122"

RPM_NAME = "rpmlint-strict-2.4.0+git20230727.0fd5122-1.1.noarch.rpm"
RPM_HASH = "73bf69c948ac96f7ef09dc811a9f2d3d0006e1a6d243737dd911140621d8172275738a1a009e537df58a665537d4270d9a0026402753f341349c817c7a1f389f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-rpmlint-strict \
rpmlint-strict"

RDEPENDS:${PN} += ""

inherit rpm
