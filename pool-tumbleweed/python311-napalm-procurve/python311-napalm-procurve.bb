SUMMARY = "NAPALM - HP ProCurve network driver"
DESCRIPTION = "ProCurve driver support for Napalm network automation."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "python311-napalm-procurve-0.7.0-6.4.noarch.rpm"
RPM_HASH = "7971c79afd80edbdb8d244e8453108c443800392fd6f16f90b74ab65e3d4e7ad5bab3eb96a9c5b725d4a70fe9da8f0af880dc4ff82d6b735db4f0d03337d27cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(napalm-procurve) \
python311-napalm-procurve \
python3dist(napalm-procurve)"

RDEPENDS:${PN} += "python(abi) \
python311-napalm \
python311-netmiko"

inherit rpm
