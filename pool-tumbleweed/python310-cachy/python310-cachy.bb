SUMMARY = "A caching library for Python"
DESCRIPTION = "Cachy provides a caching library."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-cachy-0.3.0-5.3.noarch.rpm"
RPM_HASH = "37590bc5bcc67a6b7af0ab7f5e7b29b9b848e441362d0ac6389f10556d3b0c1882f3869fe9aae337097ecc98592fd418be0118366b0054e79d6124841027e347"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cachy \
python310-cachy \
python3dist-cachy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
