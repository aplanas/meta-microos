SUMMARY = "NAPALM - HP ProCurve/Aruba network driver"
DESCRIPTION = "Napalm driver for HP ProCurve/Aruba switches."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python39-napalm-digineo-procurve-0.2.0-3.4.noarch.rpm"
RPM_HASH = "2f13b71c7dcc83b9ecd2f329caa75f3e6f4c90151c4bc00f1322f2a5147d745b67d1df5f1c70c3a3c4cb9f8452474a77952b199b50708a2c8bda485708fa9fb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(napalm-digineo-procurve) \
python39-napalm-digineo-procurve \
python3dist(napalm-digineo-procurve)"

RDEPENDS:${PN} += "python(abi) \
python39-napalm"

inherit rpm
