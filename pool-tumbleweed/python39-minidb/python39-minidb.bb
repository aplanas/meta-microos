SUMMARY = "SQLite3-based store for Python objects"
DESCRIPTION = "Minidb 2 allows you to store Python objects in a SQLite 3 database."
LICENSE = "ISC"

PV = "2.0.7"

RPM_NAME = "python39-minidb-2.0.7-1.3.noarch.rpm"
RPM_HASH = "947b2484b72a8dc0638ad082827d892af81d1807a4363e0429bb35cca4392d643733a46d7456fc95913af3a43e1c8d99f79f55da72633fd2a74368af89243a56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-minidb \
python39-minidb \
python3dist-minidb"

RDEPENDS:${PN} += "python-abi"

inherit rpm
