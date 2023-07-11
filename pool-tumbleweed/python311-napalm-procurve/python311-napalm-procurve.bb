SUMMARY = "NAPALM - HP ProCurve network driver"
DESCRIPTION = "ProCurve driver support for Napalm network automation."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "python311-napalm-procurve-0.7.0-6.6.noarch.rpm"
RPM_HASH = "d10748abc26281dc1f3e0041e4bba07cfe85d101a6940370aef3d7580829c544231847887f945594e7fed76df88b8f76491ed053280c53599d1b347cc112c7c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-napalm-procurve \
python3.11dist-napalm-procurve \
python311-napalm-procurve \
python3dist-napalm-procurve"

RDEPENDS:${PN} += "python-abi \
python311-napalm \
python311-netmiko"

inherit rpm
