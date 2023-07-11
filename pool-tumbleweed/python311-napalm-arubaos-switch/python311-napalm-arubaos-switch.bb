SUMMARY = "NAPALM - ArubaOS network driver"
DESCRIPTION = "ArubaOS driver support for NAPLAM network automation. \
This Drivers uses the REST interface."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-napalm-arubaos-switch-0.2.0-3.6.noarch.rpm"
RPM_HASH = "f6e27ddeff070ec321af56c15d8c2dadbfc15783bff2a050259fd9ab3feb80d64c0d63004d31b5b0d4d000ac20c88ac6a497b164d3a078a2b8631a05c7d8b66a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-napalm-arubaos-switch \
python3.11dist-napalm-arubaos-switch \
python311-napalm-arubaos-switch \
python3dist-napalm-arubaos-switch"

RDEPENDS:${PN} += "python-abi \
python311-napalm \
python311-netaddr \
python311-requests \
python311-requests-toolbelt \
python311-textfsm"

inherit rpm
