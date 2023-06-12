SUMMARY = "BSON codec for Python"
DESCRIPTION = "BSON codec for Python."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "0.5.10"

RPM_NAME = "python311-bson-0.5.10-2.3.noarch.rpm"
RPM_HASH = "00ca3bab0b4cf16ca66b1c3a2472c5f1c07096d183729abcf8f094ceb29dfb931005909d35d633ce89e4a3da775cf3954e49f695efa25c1d61b66f93ec3e319e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(bson) \
python311-bson \
python3dist(bson)"
RDEPENDS:${PN} += "python(abi) \
python311-python-dateutil"

inherit rpm
