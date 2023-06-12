SUMMARY = "Tox plugin to workaround no internet connection"
DESCRIPTION = "Workarounds for using tox with no internet connection."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python310-tox-no-internet-0.1.0-1.14.noarch.rpm"
RPM_HASH = "baede842d2880b11b6f28a54510636bc03649473b2993b644f9ab3f5e508b5387a1465f71e1b08bd0dcd764cc1f33c5f605bd97631a5c6cc493036a922f657ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tox-no-internet \
python3.10dist(tox-no-internet) \
python310-tox-no-internet \
python3dist(tox-no-internet)"
RDEPENDS:${PN} += "python(abi) \
python310-tox"

inherit rpm
