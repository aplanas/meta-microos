SUMMARY = "Unit and integration tests for Salt"
DESCRIPTION = "Collections of unit and integration tests for Salt"
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-tests-3006.0-1.1.aarch64.rpm"
RPM_HASH = "012c24a3e2999ea2ab955b5c87f01446fcc859856abb7d26ecd90567a05b3ab466a16d4c8b3ea80b56e077bccebf90cd8735164fbbf375fb70c54b764dc07ac3"

RPROVIDES:${PN} += "salt-tests"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
salt"

inherit rpm
