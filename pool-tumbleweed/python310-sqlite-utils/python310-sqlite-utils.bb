SUMMARY = "Python CLI tool and library for manipulating SQLite databases"
DESCRIPTION = "CLI tool and Python utility functions for manipulating SQLite databases."
LICENSE = "Apache-2.0"

PV = "3.24"

RPM_NAME = "python310-sqlite-utils-3.24-1.10.noarch.rpm"
RPM_HASH = "8798a935c0cc4b6991a00e5a425e8019dbe342531ad36b20cabcd7f414ff063635493c86c32a23626c155d98d0103a72c7ce4ec1a18587e98dbab3b0d958d2cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sqlite-utils \
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
