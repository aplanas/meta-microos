SUMMARY = "Unit and integration tests for Salt"
DESCRIPTION = "Collections of unit and integration tests for Salt"
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-tests-3006.0-4.1.aarch64.rpm"
RPM_HASH = "0cb9a184883de510c086a9974e16d0abc96ad640442c1d47ea5cabdd76c555dcff85c74b42495bbb9ceb02c49438897544b0a5d88ec71ee6f099cb0fac988fea"

RPROVIDES:${PN} += "salt-tests"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
salt"

inherit rpm
