SUMMARY = "A python library adding a json log formatter"
DESCRIPTION = "A python library adding a json log formatter."
LICENSE = "BSD-2-Clause"

PV = "2.0.7"

RPM_NAME = "python39-python-json-logger-2.0.7-2.1.noarch.rpm"
RPM_HASH = "319e4fb41b761241a003ca50d3a91303f7999cfe77b3b51046a5beffcd14c56af4065b3984a1b5ee758632af4d8e9a026ee98d3900ef1338a691a1d28825f375"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-json-logger \
python39-python-json-logger \
python3dist-python-json-logger"

RDEPENDS:${PN} += "python-abi"

inherit rpm
