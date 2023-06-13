SUMMARY = "Documentation for mm-common, includes example mm module skeleton"
DESCRIPTION = "Package contains short documentation for mm-common and example skeleton module, \
which could be used as a base for new mm module."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.4"

RPM_NAME = "mm-common-docs-1.0.4-1.5.noarch.rpm"
RPM_HASH = "254e5729b08c2de4ee3bcb769ba92d3e13478088daef13697d13283f9246157ab993d4147e759a83e6de383fbaec3cdea99341133478aa4841ee5108fd31ec88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mm-common-docs"

RDEPENDS:${PN} += "mm-common"

inherit rpm
