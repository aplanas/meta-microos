SUMMARY = "A lightweight python automatic-array library"
DESCRIPTION = "Write backend agnostic numeric code compatible with any numpy-ish array library."
LICENSE = "Apache-2.0"

PV = "0.6.3"

RPM_NAME = "python311-autoray-0.6.3-1.3.noarch.rpm"
RPM_HASH = "cea1e6a90041da3936ea6df091d90b0d06d41a501576a790b8979e25593efed69565191b96dea7d7c936577c711a83e3ba4506e8e81421eee8ec4de4d6355ce5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-autoray \
python3.11dist-autoray \
python311-autoray \
python3dist-autoray"

RDEPENDS:${PN} += "python-abi"

inherit rpm
