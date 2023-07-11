SUMMARY = "Python Wrapper for the Proxmox 2x API (HTTP and SSH)"
DESCRIPTION = "Python Wrapper for the Proxmox 2.x API (HTTP and SSH)"
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python39-proxmoxer-2.0.1-1.3.noarch.rpm"
RPM_HASH = "7731b2a620d4b2e03478eec28c0660c70f43ade22862bee87dbaa14c28d71f4b671bf52ce98863c4272113dff5067f5d9292d78a3dec65af608de138e20d8cbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-proxmoxer \
python39-proxmoxer \
python3dist-proxmoxer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
