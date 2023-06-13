SUMMARY = "Hetzner Cloud SDK"
DESCRIPTION = "A Python 3 SDK for the Hetzner cloud service."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python39-hetznercloud-1.1.1-3.11.noarch.rpm"
RPM_HASH = "f3ec1a65a6821975b35962c17859e12f879979f077b3fa06b6a500beb0daa402323fc3823dcea0ab31617c3e7fcd431a041423aebab146debae5aab1e7999c89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(hetznercloud) \
python39-hetznercloud \
python3dist(hetznercloud)"

RDEPENDS:${PN} += "python(abi) \
python39-requests"

inherit rpm
