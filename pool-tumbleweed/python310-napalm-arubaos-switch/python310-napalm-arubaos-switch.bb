SUMMARY = "NAPALM - ArubaOS network driver"
DESCRIPTION = "ArubaOS driver support for NAPLAM network automation. \
This Drivers uses the REST interface."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-napalm-arubaos-switch-0.2.0-3.6.noarch.rpm"
RPM_HASH = "dcd501a5585aa46147c20afe19dba5820e169d208fafb5b73d7e70d617c2ef126698ea652bb5e8c6170119075466068c19129ecfb8d9ecc5569c3b67c642ad56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-napalm-arubaos-switch \
python310-napalm-arubaos-switch \
python3dist-napalm-arubaos-switch"

RDEPENDS:${PN} += "python-abi \
python310-napalm \
python310-netaddr \
python310-requests \
python310-requests-toolbelt \
python310-textfsm"

inherit rpm
