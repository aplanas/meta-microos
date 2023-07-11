SUMMARY = "NAPALM - HP ProCurve network driver"
DESCRIPTION = "ProCurve driver support for Napalm network automation."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "python39-napalm-procurve-0.7.0-6.6.noarch.rpm"
RPM_HASH = "6ab63fb5eb70471ab6de14cb0062f01f489c36aeae85ab05b59641f8810991aef0129a53eac607488a082df8177d826da0f4d4fa4445ad44622d19b460d0de4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-napalm-procurve \
python39-napalm-procurve \
python3dist-napalm-procurve"

RDEPENDS:${PN} += "python-abi \
python39-napalm \
python39-netmiko"

inherit rpm
