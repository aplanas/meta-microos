SUMMARY = "Unit and integration tests for Salt"
DESCRIPTION = "Collections of unit and integration tests for Salt"
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-tests-3006.0-1.4.aarch64.rpm"
RPM_HASH = "65b2b3da902e80dbcf343f25db4051b18f3cfc0eac0dfb2e58e9beb8e0d5964489d00c141a03ba2403467ff5dc4aeae2c14eb97df9798034dfa8c8e6a53d9372"

RPROVIDES:${PN} += "salt-tests"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
salt"

inherit rpm
