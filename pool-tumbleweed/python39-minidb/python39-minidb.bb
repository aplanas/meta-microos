SUMMARY = "SQLite3-based store for Python objects"
DESCRIPTION = "Minidb 2 allows you to store Python objects in a SQLite 3 database."
LICENSE = "ISC"

PV = "2.0.7"

RPM_NAME = "python39-minidb-2.0.7-1.4.noarch.rpm"
RPM_HASH = "e30ce5de9426975a548028859eb351444f17f6728ab56e27d65094454c28b46389a770cfcce14c3eb9d8070b4daea2f742c6a23834c31b78ec60ddb02c5fac28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-minidb \
python39-minidb \
python3dist-minidb"

RDEPENDS:${PN} += "python-abi"

inherit rpm
