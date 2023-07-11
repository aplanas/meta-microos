SUMMARY = "VMware vSphere Python SDK"
DESCRIPTION = "pyVmomi is the Python SDK for the VMware vSphere API that allows you to manage \
ESX, ESXi, and vCenter."
LICENSE = "Apache-2.0"

PV = "7.0.3"

RPM_NAME = "python311-pyvmomi-7.0.3-2.9.noarch.rpm"
RPM_HASH = "a974a5293e6aa4fe4f7181ea699270da686fb09d6d9f22459cd662f6ee84d33b6f59cd767d419b54a518e5d33a1e0b81f34da08268d36e26fad7cef8a02ed644"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyvmomi \
python3.11dist-pyvmomi \
python311-pyvmomi \
python3dist-pyvmomi"

RDEPENDS:${PN} += "python-abi \
python311-requests \
python311-six"

inherit rpm
