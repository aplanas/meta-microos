SUMMARY = "VMware vSphere Python SDK"
DESCRIPTION = "pyVmomi is the Python SDK for the VMware vSphere API that allows you to manage \
ESX, ESXi, and vCenter."
LICENSE = "Apache-2.0"

PV = "7.0.3"

RPM_NAME = "python310-pyvmomi-7.0.3-2.9.noarch.rpm"
RPM_HASH = "ab45ea507a537cbef292009b7926cc6e0c5b92972e0f948da1b3d1a4e2deb97533f85a288dad0d0a1402695246f64367b35055d459853e036235731ed9c7af7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyvmomi \
python310-pyvmomi \
python3dist-pyvmomi"

RDEPENDS:${PN} += "python-abi \
python310-requests \
python310-six"

inherit rpm
