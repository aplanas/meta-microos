SUMMARY = "Python CLI tool and library for manipulating SQLite databases"
DESCRIPTION = "CLI tool and Python utility functions for manipulating SQLite databases."
LICENSE = "Apache-2.0"

PV = "3.24"

RPM_NAME = "python310-sqlite-utils-3.24-1.8.noarch.rpm"
RPM_HASH = "5d1a5b965cf8859ac58b96cd42e54c843a90a5df184e17823192e791c4f67a3a3ed2c1403c002a01a593e669d6a765eabc0a9bfc4994d07df8555856ab06fac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sqlite-utils \
python3.10dist-sqlite-utils \
python310-sqlite-utils \
python3dist-sqlite-utils"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-click \
python310-click-default-group \
python310-sqlite-fts4 \
python310-tabulate \
update-alternatives"

inherit rpm
