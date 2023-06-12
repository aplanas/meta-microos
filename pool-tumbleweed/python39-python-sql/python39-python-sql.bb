SUMMARY = "Library to write SQL queries"
DESCRIPTION = "python-sql is a library to write SQL queries in a pythonic way."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "python39-python-sql-1.4.0-1.5.noarch.rpm"
RPM_HASH = "8181c0302c15f2cc6f9f91ca87fae704da74143e753f6aae60f810752da43a2023920af29c833b13d37bc397fbd3ddf5416346a85d1b11999b563f9e5f9cc4b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-sql) \
python39-python-sql \
python3dist(python-sql)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
