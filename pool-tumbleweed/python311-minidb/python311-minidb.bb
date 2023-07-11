SUMMARY = "SQLite3-based store for Python objects"
DESCRIPTION = "Minidb 2 allows you to store Python objects in a SQLite 3 database."
LICENSE = "ISC"

PV = "2.0.7"

RPM_NAME = "python311-minidb-2.0.7-1.4.noarch.rpm"
RPM_HASH = "5752fc425be67d20198e0be291cb155a1f290b49e5b5126304a8dfc2f3bb90d61792e7c51e67443d41cc693b879baafa15933c7bdf07e0cbcf5226ed2f1f15a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-minidb \
python3.11dist-minidb \
python311-minidb \
python3dist-minidb"

RDEPENDS:${PN} += "python-abi"

inherit rpm
