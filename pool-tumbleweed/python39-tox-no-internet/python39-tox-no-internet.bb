SUMMARY = "Tox plugin to workaround no internet connection"
DESCRIPTION = "Workarounds for using tox with no internet connection."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python39-tox-no-internet-0.1.0-1.15.noarch.rpm"
RPM_HASH = "5656c9a9a1d2b9cd44ae06fea8c1b21eb8e03f8559e105c8d0345904cd907a66f0424d8a9111d2ce7ec92cbf1be10715444b936014df42be7c4d55ea1c569a0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tox-no-internet \
python39-tox-no-internet \
python3dist-tox-no-internet"

RDEPENDS:${PN} += "python-abi \
python39-tox"

inherit rpm
