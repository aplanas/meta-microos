SUMMARY = "Python CLI tool and library for manipulating SQLite databases"
DESCRIPTION = "CLI tool and Python utility functions for manipulating SQLite databases."
LICENSE = "Apache-2.0"

PV = "3.24"

RPM_NAME = "python39-sqlite-utils-3.24-1.10.noarch.rpm"
RPM_HASH = "70359d0628f9007e5897acdb194ff147beb6cd0e41dfe8a420ef1f35bd5ceac002ef0625d4a03eadc81dae7e0e0bddf48f666b41d864c4f59322f8184847c65c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sqlite-utils \
python39-sqlite-utils \
python3dist-sqlite-utils"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-click \
python39-click-default-group \
python39-sqlite-fts4 \
python39-tabulate \
update-alternatives"

inherit rpm
