SUMMARY = "NAPALM - HP ProCurve/Aruba network driver"
DESCRIPTION = "Napalm driver for HP ProCurve/Aruba switches."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python39-napalm-digineo-procurve-0.2.0-3.6.noarch.rpm"
RPM_HASH = "ce454c8177167740d6d12654dd2fb6750780c61ace237182d5362038deb6394eaa144818488be937ca657272f22fe9d10b51930f72a9953ee618785b8c84e9cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-napalm-digineo-procurve \
python39-napalm-digineo-procurve \
python3dist-napalm-digineo-procurve"

RDEPENDS:${PN} += "python-abi \
python39-napalm"

inherit rpm
