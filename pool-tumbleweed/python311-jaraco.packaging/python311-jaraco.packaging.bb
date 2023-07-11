SUMMARY = "Supplement packaging Python releases"
DESCRIPTION = "Tools to supplement packaging Python releases."
LICENSE = "MIT"

PV = "9.2.0"

RPM_NAME = "python311-jaraco.packaging-9.2.0-1.3.noarch.rpm"
RPM_HASH = "4bea6b832e9f08023e6746d180436ddf9e6b07655ff9e315019e39db426e03a7d11ecf1d9e0f4bd938e191898f56872191e67f1242ae6351a97c5381aecc09ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.packaging \
python3.11dist-jaraco.packaging \
python311-jaraco.packaging \
python3dist-jaraco.packaging"

RDEPENDS:${PN} += "python-abi \
python311-build \
python311-jaraco.context \
python311-virtualenv"

inherit rpm
