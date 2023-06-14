SUMMARY = "Library for simplifying the communication with ResultsDB"
DESCRIPTION = "The ResultsDB API module provides a Python API for using ResultsDB's \
JSON/REST interface in a more pythonic way. It has functions which match \
the JSON/REST methods, but allow the common goodies as named parameters, \
and parameters skipping."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.5"

RPM_NAME = "python39-resultsdb_api-2.1.5-1.3.noarch.rpm"
RPM_HASH = "8a14d21454756b9c2bb6b585590ae2268044bd2585aa0e7e01df889e5bcbd433f7f03f0bf5471d97250f68fbacbe9cce46219817948a45dcb57123b947764467"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-resultsdb-api \
python39-resultsdb-api \
python3dist-resultsdb-api"

RDEPENDS:${PN} += "python-abi \
python39-requests \
python39-simplejson"

inherit rpm
