SUMMARY = "Python Wrapper for the Proxmox 2x API (HTTP and SSH)"
DESCRIPTION = "Python Wrapper for the Proxmox 2.x API (HTTP and SSH)"
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python311-proxmoxer-2.0.1-1.3.noarch.rpm"
RPM_HASH = "abebbddafaa8778be4ca32c9b332b406cbc601ebb815a067171c932f18760303bc3df96153f8d03fd1bc8d75d7899c62d91e2d9723a69f4ed6e6b417c92b33b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-proxmoxer \
python3.11dist-proxmoxer \
python311-proxmoxer \
python3dist-proxmoxer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
