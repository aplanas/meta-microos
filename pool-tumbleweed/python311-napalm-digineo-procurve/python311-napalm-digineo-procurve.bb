SUMMARY = "NAPALM - HP ProCurve/Aruba network driver"
DESCRIPTION = "Napalm driver for HP ProCurve/Aruba switches."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python311-napalm-digineo-procurve-0.2.0-3.4.noarch.rpm"
RPM_HASH = "982747330ab35aa722099a3bfec3ecf0051647c73fdda710d8564f2d1c50f70f6fb01ed38d4e2eee3c16dd072c160e9bd98ffd895e29d22ba2456103aedd5965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(napalm-digineo-procurve) \
python311-napalm-digineo-procurve \
python3dist(napalm-digineo-procurve)"

RDEPENDS:${PN} += "python(abi) \
python311-napalm"

inherit rpm
