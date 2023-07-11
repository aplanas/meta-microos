SUMMARY = "Python driver library for the RethinkDB database server"
DESCRIPTION = "Python driver library for the RethinkDB database server."
LICENSE = "Apache-2.0"

PV = "2.4.9"

RPM_NAME = "python39-rethinkdb-2.4.9-1.5.noarch.rpm"
RPM_HASH = "1c1f0ed4fc69486689bc06b275bb71f6a3edaea0a6e49bedd7fd9f601a4730ecd3469d3fe40fe0982186cd968e96634be559c0ccc40422cedca351a415416333"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rethinkdb \
python39-rethinkdb \
python3dist-rethinkdb"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-six \
update-alternatives"

inherit rpm
