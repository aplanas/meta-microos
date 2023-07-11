SUMMARY = "VMware vSphere Python SDK"
DESCRIPTION = "pyVmomi is the Python SDK for the VMware vSphere API that allows you to manage \
ESX, ESXi, and vCenter."
LICENSE = "Apache-2.0"

PV = "7.0.3"

RPM_NAME = "python39-pyvmomi-7.0.3-2.9.noarch.rpm"
RPM_HASH = "62911f7b56ca87a17ebc05ecda30b605556c6a2e19251976eb0fbde9496e837494b88cd830eb7f3794702c55fc50e7115e5356b57901ed0f9d86cbf982401a47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyvmomi \
python39-pyvmomi \
python3dist-pyvmomi"

RDEPENDS:${PN} += "python-abi \
python39-requests \
python39-six"

inherit rpm
