SUMMARY = "Module for enumerating IP addresses on system network adapters"
DESCRIPTION = "ifaddr is a Python library that allows finding the \
IP addresses assigned to the system."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-ifaddr-0.2.0-2.3.noarch.rpm"
RPM_HASH = "f667adc4e92cd9bd4f5af10871e844864b9386042c2f1de4085897b47196f233be20714954844e18f5ba8a0ec11901beed310d80aac572f5518d8c5f6d052815"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ifaddr \
python311-ifaddr \
python3dist-ifaddr"

RDEPENDS:${PN} += "python-abi"

inherit rpm
