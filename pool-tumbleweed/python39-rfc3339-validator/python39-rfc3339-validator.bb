SUMMARY = "A pure python RFC3339 validator"
DESCRIPTION = "A pure python RFC3339 validator"
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "python39-rfc3339-validator-0.1.4-2.1.noarch.rpm"
RPM_HASH = "d802fac7a5fd80d69d44b6c161fb7592538beca1f837f3ca73c772aa17ed3df615ee9c2f0454c3e1c06cdda6a9168804b2a57bffd5816323cf1c498cf7e6d889"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(rfc3339-validator) \
python39-rfc3339-validator \
python3dist(rfc3339-validator)"
RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
