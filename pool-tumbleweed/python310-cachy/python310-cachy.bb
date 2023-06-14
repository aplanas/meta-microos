SUMMARY = "A caching library for Python"
DESCRIPTION = "Cachy provides a caching library."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-cachy-0.3.0-5.1.noarch.rpm"
RPM_HASH = "ed0f0d8b40455b7686d64c42238fb339328b9dc41393a7dd4351265f2ba5b8ff210a4fe6781cc492f7e384c5c19ef603dcdae1938a7554395ee8cab0fb70dae4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cachy \
python3.10dist-cachy \
python310-cachy \
python3dist-cachy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
