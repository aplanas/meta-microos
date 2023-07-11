SUMMARY = "Module for enumerating IP addresses on system network adapters"
DESCRIPTION = "ifaddr is a Python library that allows finding the \
IP addresses assigned to the system."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-ifaddr-0.2.0-3.1.noarch.rpm"
RPM_HASH = "960eb32b5daffea9c63a1c5eac216a65e50c584b047d2f228b2b8652a713fb9eb8795d0cd239732c33166e7fed96e87b66a54471a335a5f0ad7c7e51ec8a8857"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ifaddr \
python39-ifaddr \
python3dist-ifaddr"

RDEPENDS:${PN} += "python-abi"

inherit rpm
