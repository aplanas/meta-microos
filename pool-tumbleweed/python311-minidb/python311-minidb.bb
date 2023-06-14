SUMMARY = "SQLite3-based store for Python objects"
DESCRIPTION = "Minidb 2 allows you to store Python objects in a SQLite 3 database."
LICENSE = "ISC"

PV = "2.0.7"

RPM_NAME = "python311-minidb-2.0.7-1.3.noarch.rpm"
RPM_HASH = "dfca26b9f36a557a1b470981997781aff2caa006e59ab1b49729addf4ff31701582c6438c53a93cae15e9a192248e58bec0aaf592fdbce4e79dbbb694fd26069"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-minidb \
python311-minidb \
python3dist-minidb"

RDEPENDS:${PN} += "python-abi"

inherit rpm
