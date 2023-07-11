SUMMARY = "BSON codec for Python"
DESCRIPTION = "BSON codec for Python."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "0.5.10"

RPM_NAME = "python311-bson-0.5.10-2.5.noarch.rpm"
RPM_HASH = "53c878f2565843c62a10d1732d8df1934b819d98cadc246079c986dab0a83cd8d52495faf910be9d3557f3ea0faf5f4667db1c53776dcc4b12e82cdd34b7da93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bson \
python3.11dist-bson \
python311-bson \
python3dist-bson"

RDEPENDS:${PN} += "python-abi \
python311-python-dateutil"

inherit rpm
