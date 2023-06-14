SUMMARY = "Namecheap API client in Python"
DESCRIPTION = "Namecheap API client in Python"
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python310-PyNamecheap-0.0.3-2.14.noarch.rpm"
RPM_HASH = "8beca03fbe7158aa37503df9c38d97d7603e7cc41f6ae0bf75c049c9f9fad2d56f0658308f3beba15d7465cd4f5a19cd3d43f581b3aae782943970aa071792c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyNamecheap \
python3.10dist-pynamecheap \
python310-PyNamecheap \
python3dist-pynamecheap"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
