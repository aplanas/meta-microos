SUMMARY = "Firefox Accounts client library for Python"
DESCRIPTION = "This is python library for interacting with the Firefox Accounts ecosystem."
LICENSE = "MPL-2.0"

PV = "0.7.7"

RPM_NAME = "python311-PyFxA-0.7.7-3.9.noarch.rpm"
RPM_HASH = "bc99f47f0bc3092044cdea255d7d696d949a4b2fc97416ed0eace44a7764c575c4f763689665cf8e18b6f2671f79516349465b37f52fc6cd3200ba33b916c465"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyFxA \
python3.11dist-pyfxa \
python311-PyFxA \
python3dist-pyfxa"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyBrowserID \
python311-cryptography \
python311-requests \
python311-six \
update-alternatives"

inherit rpm
