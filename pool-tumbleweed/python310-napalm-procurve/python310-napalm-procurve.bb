SUMMARY = "NAPALM - HP ProCurve network driver"
DESCRIPTION = "ProCurve driver support for Napalm network automation."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "python310-napalm-procurve-0.7.0-6.6.noarch.rpm"
RPM_HASH = "41be670c8fa8c93a07dd31104a52b21b65cd468e59f4da56d7339d23254e6632641c4baa70f7c0a3ec2642d3faf019e0e6210856044f4b5420c4be8b4c91d42e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-napalm-procurve \
python310-napalm-procurve \
python3dist-napalm-procurve"

RDEPENDS:${PN} += "python-abi \
python310-napalm \
python310-netmiko"

inherit rpm
