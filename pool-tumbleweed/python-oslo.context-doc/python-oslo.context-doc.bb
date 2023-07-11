SUMMARY = "Documentation for OpenStack common context library"
DESCRIPTION = "Documentation for the oslo-context library."
LICENSE = "Apache-2.0"

PV = "5.0.0"

RPM_NAME = "python-oslo.context-doc-5.0.0-1.5.noarch.rpm"
RPM_HASH = "5d6cd6da6ee6126007b698b35292d2054bfbb1d041100f9c5adae8728cd37d80eff61a39c4b5dad5a0d662d1dbd247f467dda7b791f92b8a3d9feb5eac5e0466"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.context-doc"

RDEPENDS:${PN} += ""

inherit rpm
