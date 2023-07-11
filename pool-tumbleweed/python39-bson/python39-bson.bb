SUMMARY = "BSON codec for Python"
DESCRIPTION = "BSON codec for Python."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "0.5.10"

RPM_NAME = "python39-bson-0.5.10-2.5.noarch.rpm"
RPM_HASH = "f67fff0644721bde094bc37fb116c21cae4bae30a6607c8f1c11223bb087c02d6f3f295d57b74c61f182c152cb7821c71340280380d98166894733336b83a00d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bson \
python39-bson \
python3dist-bson"

RDEPENDS:${PN} += "python-abi \
python39-python-dateutil"

inherit rpm
