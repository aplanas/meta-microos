SUMMARY = "Library for simplifying the communication with ResultsDB"
DESCRIPTION = "The ResultsDB API module provides a Python API for using ResultsDB's \
JSON/REST interface in a more pythonic way. It has functions which match \
the JSON/REST methods, but allow the common goodies as named parameters, \
and parameters skipping."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.5"

RPM_NAME = "python311-resultsdb_api-2.1.5-1.5.noarch.rpm"
RPM_HASH = "209c9a4abf315f5727d2d8842a37d7ce2ccdab0d80f2361c5ff584fef741da18a5ccaa31285d38e8f2744e0ed31ff49f2a3d29527edc17ef6cf9111d47403cea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-resultsdb-api \
python3.11dist-resultsdb-api \
python311-resultsdb-api \
python3dist-resultsdb-api"

RDEPENDS:${PN} += "python-abi \
python311-requests \
python311-simplejson"

inherit rpm
