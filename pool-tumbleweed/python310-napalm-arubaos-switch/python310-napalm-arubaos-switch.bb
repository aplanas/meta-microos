SUMMARY = "NAPALM - ArubaOS network driver"
DESCRIPTION = "ArubaOS driver support for NAPLAM network automation. \
This Drivers uses the REST interface."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-napalm-arubaos-switch-0.2.0-3.4.noarch.rpm"
RPM_HASH = "4d8048db35eb0c349d11b5b836b45a6d805a7664601805f4134650316d54b11bc5105863de700b5aa246d8badf51ecc12dcbf65cc4af238a4e75cb64ad3f2c44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-napalm-arubaos-switch \
python3.10dist-napalm-arubaos-switch \
python310-napalm-arubaos-switch \
python3dist-napalm-arubaos-switch"

RDEPENDS:${PN} += "python-abi \
python310-napalm \
python310-netaddr \
python310-requests \
python310-requests-toolbelt \
python310-textfsm"

inherit rpm
