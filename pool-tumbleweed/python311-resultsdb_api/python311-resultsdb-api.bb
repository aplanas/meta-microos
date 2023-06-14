SUMMARY = "Library for simplifying the communication with ResultsDB"
DESCRIPTION = "The ResultsDB API module provides a Python API for using ResultsDB's \
JSON/REST interface in a more pythonic way. It has functions which match \
the JSON/REST methods, but allow the common goodies as named parameters, \
and parameters skipping."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.5"

RPM_NAME = "python311-resultsdb_api-2.1.5-1.3.noarch.rpm"
RPM_HASH = "b736b3c42ad64eb537f3b8eb85e8e3054d54c09df91f6b606a41eb7d562a8f6ebb1b76cbc1fe3963167efcedd0b6fd27364f40bc3dc8db3217d5e1b75db32978"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-resultsdb-api \
python311-resultsdb-api \
python3dist-resultsdb-api"

RDEPENDS:${PN} += "python-abi \
python311-requests \
python311-simplejson"

inherit rpm
