SUMMARY = "Python CLI tool and library for manipulating SQLite databases"
DESCRIPTION = "CLI tool and Python utility functions for manipulating SQLite databases."
LICENSE = "Apache-2.0"

PV = "3.24"

RPM_NAME = "python39-sqlite-utils-3.24-1.8.noarch.rpm"
RPM_HASH = "17bf5a5e5742857c1fc75d1e0ad0f542148896b53bf3919fcb02a7b35e60e74382fb94383b9179a9b645c6a557807865b8d571d3e1838c30e8210dee6b4e19ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sqlite-utils \
python39-sqlite-utils \
python3dist-sqlite-utils"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-click \
python39-click-default-group \
python39-sqlite-fts4 \
python39-tabulate \
update-alternatives"

inherit rpm
