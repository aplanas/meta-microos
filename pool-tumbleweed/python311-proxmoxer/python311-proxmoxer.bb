SUMMARY = "Python Wrapper for the Proxmox 2x API (HTTP and SSH)"
DESCRIPTION = "Python Wrapper for the Proxmox 2.x API (HTTP and SSH)"
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python311-proxmoxer-2.0.1-1.2.noarch.rpm"
RPM_HASH = "9d8f5985cf20d02b2d27c7548da7309f63c5bca562a20c00d9e9337337c0a333a23d1588e348d47b75553f4ddccd0181146d57cdeccd0cbdbe4b896334ecacdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(proxmoxer) \
python311-proxmoxer \
python3dist(proxmoxer)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
