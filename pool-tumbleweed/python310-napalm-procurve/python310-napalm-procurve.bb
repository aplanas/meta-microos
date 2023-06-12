SUMMARY = "NAPALM - HP ProCurve network driver"
DESCRIPTION = "ProCurve driver support for Napalm network automation."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "python310-napalm-procurve-0.7.0-6.4.noarch.rpm"
RPM_HASH = "52236227e2dd5e28bdf666120817be810f853ed1341f45f31557dce5fd2e20795238f83aa8b8a58c086a0775eb1aa6bf868460d37caf749a948591c99659bd91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-napalm-procurve \
python3.10dist(napalm-procurve) \
python310-napalm-procurve \
python3dist(napalm-procurve)"
RDEPENDS:${PN} += "python(abi) \
python310-napalm \
python310-netmiko"

inherit rpm
