SUMMARY = "SQLite3-based store for Python objects"
DESCRIPTION = "Minidb 2 allows you to store Python objects in a SQLite 3 database."
LICENSE = "ISC"

PV = "2.0.7"

RPM_NAME = "python310-minidb-2.0.7-1.4.noarch.rpm"
RPM_HASH = "20359b3e6ee1d2aeb6a246b336e63dddea71ad27454c8cf856f2264c909e722c35959b28999656932d9ee9c72db91c9d8c053364935e9b27d67ab81a876890c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-minidb \
python310-minidb \
python3dist-minidb"

RDEPENDS:${PN} += "python-abi"

inherit rpm
