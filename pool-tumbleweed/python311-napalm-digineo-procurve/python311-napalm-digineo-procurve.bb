SUMMARY = "NAPALM - HP ProCurve/Aruba network driver"
DESCRIPTION = "Napalm driver for HP ProCurve/Aruba switches."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python311-napalm-digineo-procurve-0.2.0-3.6.noarch.rpm"
RPM_HASH = "e3f5f53e2840d193e4f235106dedac139614cb6179b2f8f29e67a74be0dfe3c9dd678ef077a4a98b5821b571c8f5e7f7c0927da41841b26fee588f220b42e5b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-napalm-digineo-procurve \
python3.11dist-napalm-digineo-procurve \
python311-napalm-digineo-procurve \
python3dist-napalm-digineo-procurve"

RDEPENDS:${PN} += "python-abi \
python311-napalm"

inherit rpm
