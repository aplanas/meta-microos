SUMMARY = "NAPALM - ArubaOS network driver"
DESCRIPTION = "ArubaOS driver support for NAPLAM network automation. \
This Drivers uses the REST interface."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-napalm-arubaos-switch-0.2.0-3.4.noarch.rpm"
RPM_HASH = "e27be2429c0fa7dbc1bd033de3b62f4b22c2c446b3cb28e70b6dfd8f34b0e8ef576b9d73e66d8991737337a2187c19d86f6469dbd9caf227ce9800366aca924d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-napalm-arubaos-switch \
python311-napalm-arubaos-switch \
python3dist-napalm-arubaos-switch"

RDEPENDS:${PN} += "python-abi \
python311-napalm \
python311-netaddr \
python311-requests \
python311-requests-toolbelt \
python311-textfsm"

inherit rpm
