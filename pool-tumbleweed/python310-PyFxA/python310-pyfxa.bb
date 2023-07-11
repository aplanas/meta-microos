SUMMARY = "Firefox Accounts client library for Python"
DESCRIPTION = "This is python library for interacting with the Firefox Accounts ecosystem."
LICENSE = "MPL-2.0"

PV = "0.7.7"

RPM_NAME = "python310-PyFxA-0.7.7-3.9.noarch.rpm"
RPM_HASH = "a09076356e1f4ac0bf0b8ec073af6b867e348d89518cd21da63be3428d450ca69f9c939e96aec8a5faab36554d2f86075a48b23b0e676a814b02897715a74cfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyfxa \
python310-PyFxA \
python3dist-pyfxa"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyBrowserID \
python310-cryptography \
python310-requests \
python310-six \
update-alternatives"

inherit rpm
