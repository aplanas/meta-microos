SUMMARY = "Python wrapper for Subscene subtitle database"
DESCRIPTION = "Exposes the Subscene subtitle database API to Python."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "python39-subscene-api-2.0.0-2.17.noarch.rpm"
RPM_HASH = "20a432977ecc499bcbcafe990f1d753bb24edc75158779aac799e06d18d5c07b83a8d4701e034eae3b7dd185956a0a0b663c373129e86f0fb3bab92c2a2e7e27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-subscene-api \
python39-subscene-api \
python3dist-subscene-api"

RDEPENDS:${PN} += "python-abi \
python39-beautifulsoup4"

inherit rpm
