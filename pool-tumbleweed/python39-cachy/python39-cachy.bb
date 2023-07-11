SUMMARY = "A caching library for Python"
DESCRIPTION = "Cachy provides a caching library."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-cachy-0.3.0-5.3.noarch.rpm"
RPM_HASH = "3db942fd388aec97a1cdfae1be904294dad1a9292a0863a41c36da2fa8037024675add3fa419995e4643957da79282d0998c32bb1af44a6ec1994595423ae2ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cachy \
python39-cachy \
python3dist-cachy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
