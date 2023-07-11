SUMMARY = "A library for parsing ISO 8601 strings"
DESCRIPTION = "aniso8601 is a Python library for parsing date strings \
in ISO 8601 format into datetime format."
LICENSE = "BSD-3-Clause"

PV = "9.0.1"

RPM_NAME = "python39-aniso8601-9.0.1-2.3.noarch.rpm"
RPM_HASH = "08bc3a33ca5434955ab6ff41886bd6ad60d4ec4f87f02d30316747286923282fdce372dafc72913a19104d54f286f229d58c0bf0efb6ce5ac04d70917201a012"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aniso8601 \
python39-aniso8601 \
python3dist-aniso8601"

RDEPENDS:${PN} += "python-abi"

inherit rpm
