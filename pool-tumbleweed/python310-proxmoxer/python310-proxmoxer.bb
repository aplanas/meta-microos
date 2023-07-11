SUMMARY = "Python Wrapper for the Proxmox 2x API (HTTP and SSH)"
DESCRIPTION = "Python Wrapper for the Proxmox 2.x API (HTTP and SSH)"
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python310-proxmoxer-2.0.1-1.3.noarch.rpm"
RPM_HASH = "393d8073c4f3cb64217d326bdbc6480a1eb29ce7b7ce037810463735d32d83f60d4481837deca22ff49ca2efe21ab4e1288ead48cf36973caef312a00b9d5707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-proxmoxer \
python310-proxmoxer \
python3dist-proxmoxer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
