SUMMARY = "BSON codec for Python"
DESCRIPTION = "BSON codec for Python."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "0.5.10"

RPM_NAME = "python310-bson-0.5.10-2.5.noarch.rpm"
RPM_HASH = "4313bf3191c7a94a704320d8472a73c4215527b8585dff3d653c2078df9f9438aed61bbaa650c1229e4be4fba72a450e9f740668872c201adb7b6aa6ba035150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-bson \
python310-bson \
python3dist-bson"

RDEPENDS:${PN} += "python-abi \
python310-python-dateutil"

inherit rpm
