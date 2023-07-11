SUMMARY = "Python CLI tool and library for manipulating SQLite databases"
DESCRIPTION = "CLI tool and Python utility functions for manipulating SQLite databases."
LICENSE = "Apache-2.0"

PV = "3.24"

RPM_NAME = "python311-sqlite-utils-3.24-1.10.noarch.rpm"
RPM_HASH = "615ecd60825bb9941932ae370a6c91e275dce347af8518d5edc1d59f9661236a11dbbd9879d92256a8e04982be347165be94fc2f2124b3cff24193d44b6673d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sqlite-utils \
python3.11dist-sqlite-utils \
python311-sqlite-utils \
python3dist-sqlite-utils"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-click \
python311-click-default-group \
python311-sqlite-fts4 \
python311-tabulate \
update-alternatives"

inherit rpm
