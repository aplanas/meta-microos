SUMMARY = "Library for simplifying the communication with ResultsDB"
DESCRIPTION = "The ResultsDB API module provides a Python API for using ResultsDB's \
JSON/REST interface in a more pythonic way. It has functions which match \
the JSON/REST methods, but allow the common goodies as named parameters, \
and parameters skipping."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.5"

RPM_NAME = "python39-resultsdb_api-2.1.5-1.5.noarch.rpm"
RPM_HASH = "658241d2be371f6223793a23ecec9ca1ad04b878793e9911b8977e694e1843ef6cb9c65669c267e24fa9659cf91ef740085cbc9fc72ebffd18042840c1f3e926"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-resultsdb-api \
python39-resultsdb-api \
python3dist-resultsdb-api"

RDEPENDS:${PN} += "python-abi \
python39-requests \
python39-simplejson"

inherit rpm
