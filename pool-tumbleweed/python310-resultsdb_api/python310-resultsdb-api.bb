SUMMARY = "Library for simplifying the communication with ResultsDB"
DESCRIPTION = "The ResultsDB API module provides a Python API for using ResultsDB's \
JSON/REST interface in a more pythonic way. It has functions which match \
the JSON/REST methods, but allow the common goodies as named parameters, \
and parameters skipping."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.5"

RPM_NAME = "python310-resultsdb_api-2.1.5-1.5.noarch.rpm"
RPM_HASH = "cf8eba02cf134f15c25a4eff09cb34e10ed967faca7766bf58e1473de1ef31138909c05454bb0a3eb227cc6489ffd3b82656832794e013d9aa90c41011b7b963"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-resultsdb-api \
python310-resultsdb-api \
python3dist-resultsdb-api"

RDEPENDS:${PN} += "python-abi \
python310-requests \
python310-simplejson"

inherit rpm
