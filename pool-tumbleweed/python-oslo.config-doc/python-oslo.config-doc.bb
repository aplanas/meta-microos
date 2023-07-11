SUMMARY = "Documentation for OpenStack common configuration library"
DESCRIPTION = "Documentation for the oslo-config library."
LICENSE = "Apache-2.0"

PV = "9.1.1"

RPM_NAME = "python-oslo.config-doc-9.1.1-1.2.noarch.rpm"
RPM_HASH = "25f806257dc9d209847820020865ec0c1994767f2450292addd23da17eb15cb53cfb62ccc2eb2c961b978289bbf80732ac6a56b03d5afc6550f0d65f60e0ff8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.config-doc"

RDEPENDS:${PN} += ""

inherit rpm
