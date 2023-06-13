SUMMARY = "Composable complex class support for attrs and dataclasses"
DESCRIPTION = "Composable complex class support for attrs and dataclasses."
LICENSE = "MIT"

PV = "22.2.0"

RPM_NAME = "python311-cattrs-22.2.0-2.1.noarch.rpm"
RPM_HASH = "590b128cf2993cc322dc2348ed22213627eef3ed0153f1b763d1bc899fceb38b9e1458726934569c03b593a50ffa23d11f46210141cc447c00d526fe9142bb72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cattrs) \
python311-cattrs \
python3dist(cattrs)"

RDEPENDS:${PN} += "python(abi) \
python311-attrs"

inherit rpm
