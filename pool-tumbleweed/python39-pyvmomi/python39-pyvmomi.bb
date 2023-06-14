SUMMARY = "VMware vSphere Python SDK"
DESCRIPTION = "pyVmomi is the Python SDK for the VMware vSphere API that allows you to manage \
ESX, ESXi, and vCenter."
LICENSE = "Apache-2.0"

PV = "7.0.3"

RPM_NAME = "python39-pyvmomi-7.0.3-2.7.noarch.rpm"
RPM_HASH = "1635681b05d5e90ad5053a7461203c0903bb2b987fcc93d065508c6d5402172e1f8ef30d28ec0b86e965811ef8674afdf5c4a2c4c591bd6a68381bd047e5cf89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyvmomi \
python39-pyvmomi \
python3dist-pyvmomi"

RDEPENDS:${PN} += "python-abi \
python39-requests \
python39-six"

inherit rpm
