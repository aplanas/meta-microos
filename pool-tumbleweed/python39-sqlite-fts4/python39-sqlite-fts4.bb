SUMMARY = "Python functions for working with SQLite FTS4 search"
DESCRIPTION = "Python functions for working with SQLite FTS4 search"
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "python39-sqlite-fts4-1.0.3-1.5.noarch.rpm"
RPM_HASH = "8b81e4449594d05ea3d8cd7d1802b9d07dd4b5597cdb1f36eae108b5cfa57dd6b6c0cb1a3b3eb616df28c24c0fe4019bdf36fe63fd0f834ff3fd84d04c3fe58d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sqlite-fts4 \
python39-sqlite-fts4 \
python3dist-sqlite-fts4"

RDEPENDS:${PN} += "python-abi"

inherit rpm
