SUMMARY = "Library for simplifying the communication with ResultsDB"
DESCRIPTION = "The ResultsDB API module provides a Python API for using ResultsDB's \
JSON/REST interface in a more pythonic way. It has functions which match \
the JSON/REST methods, but allow the common goodies as named parameters, \
and parameters skipping."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.5"

RPM_NAME = "python310-resultsdb_api-2.1.5-1.3.noarch.rpm"
RPM_HASH = "5884990394f61f8a416a551d5210d3c2a5095a0bdd7bce4d216405ac53fcf6d8d23cea939f644a5ae2afbe4bf655e3c559e4a4c79c00d5892d848f449539df5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-resultsdb-api \
python3.10dist-resultsdb-api \
python310-resultsdb-api \
python3dist-resultsdb-api"

RDEPENDS:${PN} += "python-abi \
python310-requests \
python310-simplejson"

inherit rpm
