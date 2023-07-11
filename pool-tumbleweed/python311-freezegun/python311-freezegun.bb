SUMMARY = "Mock time date for Python"
DESCRIPTION = "FreezeGun is a library that allows your python tests to travel through \
time by mocking the datetime module."
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "python311-freezegun-1.2.2-2.3.noarch.rpm"
RPM_HASH = "5c33843150a40d53e3c5e4c119203997e371eccb3a288e6a7926e6fa98415e6c404ab24091dee1c3d943c693a5b4c41c4a2dfd47fb3e01f084fef2439ca4d8fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-freezegun \
python3.11dist-freezegun \
python311-freezegun \
python3dist-freezegun"

RDEPENDS:${PN} += "python-abi \
python311 \
python311-python-dateutil"

inherit rpm
