SUMMARY = "Module for enumerating IP addresses on system network adapters"
DESCRIPTION = "ifaddr is a Python library that allows finding the \
IP addresses assigned to the system."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-ifaddr-0.2.0-3.1.noarch.rpm"
RPM_HASH = "84d972c73c9e271f7b7cf49a49e750c6073dbe0cd8fcedc44b97667aeaf108d3e7ecc891477879457f6784e55f280d7e3b2c93204f36d1bef765483d20b00e80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ifaddr \
python3.11dist-ifaddr \
python311-ifaddr \
python3dist-ifaddr"

RDEPENDS:${PN} += "python-abi"

inherit rpm
