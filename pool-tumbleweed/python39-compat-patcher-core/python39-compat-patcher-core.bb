SUMMARY = "Python patcher system"
DESCRIPTION = "Python patcher system to allow easy and lasting API compatibility."
LICENSE = "MIT"

PV = "2.1"

RPM_NAME = "python39-compat-patcher-core-2.1-1.4.noarch.rpm"
RPM_HASH = "a0b29c733168a0cb7574b6c62a4a012d6aedb50dd5fb314f401bf3c978beed555f93cbecb08da1e2cdb6b8e0c8f8b6eba791b53b11dcebf97b47350e9ed9c7d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-compat-patcher-core \
python39-compat-patcher-core \
python3dist-compat-patcher-core"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
