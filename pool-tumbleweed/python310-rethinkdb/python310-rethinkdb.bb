SUMMARY = "Python driver library for the RethinkDB database server"
DESCRIPTION = "Python driver library for the RethinkDB database server."
LICENSE = "Apache-2.0"

PV = "2.4.9"

RPM_NAME = "python310-rethinkdb-2.4.9-1.5.noarch.rpm"
RPM_HASH = "5a6e70e7fffd2232887782b5bd3d15dc5bf36feecbc9866db3565d755e108062e739c95b75dc5abcdf4e9550cbbc8557abc9967cb3f7a728c19757659c8e2ef9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rethinkdb \
python310-rethinkdb \
python3dist-rethinkdb"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-six \
update-alternatives"

inherit rpm
