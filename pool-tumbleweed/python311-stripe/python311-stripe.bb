SUMMARY = "Python bindings for the Stripe API"
DESCRIPTION = "Python bindings for the Stripe API."
LICENSE = "MIT"

PV = "2.63.0"

RPM_NAME = "python311-stripe-2.63.0-1.10.noarch.rpm"
RPM_HASH = "6b282244c6d00945a7c0b072346a0646f04c6a16ecb531e9e6eef1be6a6f1b400502612fd48bff8ad11deb3825c7cb24155527cece5d4ec59ea7f4f13df947ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stripe \
python3.11dist-stripe \
python311-stripe \
python3dist-stripe"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
