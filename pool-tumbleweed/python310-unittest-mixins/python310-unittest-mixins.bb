SUMMARY = "Helpful mixins for unittest classes"
DESCRIPTION = "Helpful mixins for unittest classes."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "python310-unittest-mixins-1.6-2.9.noarch.rpm"
RPM_HASH = "a0b9765b3aa1510bf80228f031b3e3da96f3982c7e49e7cacac8fc323f6e199c7e7a870179fbba66ed99d97578992c681faf78bed38134fcef3555799b709653"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-unittest-mixins \
python310-unittest-mixins \
python3dist-unittest-mixins"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
