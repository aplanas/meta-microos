SUMMARY = "NAPALM - HP ProCurve network driver"
DESCRIPTION = "ProCurve driver support for Napalm network automation."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "python39-napalm-procurve-0.7.0-6.4.noarch.rpm"
RPM_HASH = "bff96c535d5df49f7bb1fd3de75f31c6e5584e6ee99ed8d606b3a4fee99bdcf024847cfc2b03e6f1826d5f095c71be5ef36e9cda5b6999f1b878a77a14f10904"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(napalm-procurve) \
python39-napalm-procurve \
python3dist(napalm-procurve)"

RDEPENDS:${PN} += "python(abi) \
python39-napalm \
python39-netmiko"

inherit rpm
