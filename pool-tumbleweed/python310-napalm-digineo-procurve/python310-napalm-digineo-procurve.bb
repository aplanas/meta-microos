SUMMARY = "NAPALM - HP ProCurve/Aruba network driver"
DESCRIPTION = "Napalm driver for HP ProCurve/Aruba switches."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python310-napalm-digineo-procurve-0.2.0-3.4.noarch.rpm"
RPM_HASH = "9095dac7de6c497996aa605f7b4c8d4014d5f4107cf895187fb42377800dfa089a61e42ccb4a8c0ae82792d0ed1980b1dd98e81759f1663c6afd3eb30b6934fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-napalm-digineo-procurve \
python3.10dist-napalm-digineo-procurve \
python310-napalm-digineo-procurve \
python3dist-napalm-digineo-procurve"

RDEPENDS:${PN} += "python-abi \
python310-napalm"

inherit rpm
