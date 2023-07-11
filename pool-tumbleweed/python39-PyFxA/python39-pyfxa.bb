SUMMARY = "Firefox Accounts client library for Python"
DESCRIPTION = "This is python library for interacting with the Firefox Accounts ecosystem."
LICENSE = "MPL-2.0"

PV = "0.7.7"

RPM_NAME = "python39-PyFxA-0.7.7-3.9.noarch.rpm"
RPM_HASH = "9ae7922be756b9da68901eff74857c66ba96799db42d437f6d43906a8f44dffdac0fe49286ae5d60621264994a4eb9af24987ef31ff5a2410704757694d82bb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyfxa \
python39-PyFxA \
python3dist-pyfxa"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyBrowserID \
python39-cryptography \
python39-requests \
python39-six \
update-alternatives"

inherit rpm
