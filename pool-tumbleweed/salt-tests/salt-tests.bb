SUMMARY = "Unit and integration tests for Salt"
DESCRIPTION = "Collections of unit and integration tests for Salt"
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-tests-3006.0-2.1.aarch64.rpm"
RPM_HASH = "d3717e25111be94e8482c2a64b071705e4a0703ab51666f49d6134fc8ebafa7f2ab615ba0c8a6f7cac1cd15cd8d33fae056fabb6711270031f582ab9f6c5c434"

RPROVIDES:${PN} += "salt-tests"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
salt"

inherit rpm
