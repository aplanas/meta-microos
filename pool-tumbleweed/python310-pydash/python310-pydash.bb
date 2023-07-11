SUMMARY = "The kitchen sink of Python functional utility libraries"
DESCRIPTION = "The kitchen sink of Python utility libraries for doing 'stuff' in a functional way. \
Based on the Lo-Dash Javascript library."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "python310-pydash-5.1.0-1.8.noarch.rpm"
RPM_HASH = "544142d2f51082fc3280703861868d48e4ce5acda8c129b4d47ef15b4ea6f89bff0a4a9c27b8796bebc685c27c36541956acb403e9f5c90847b6a5df9468d08b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pydash \
python310-pydash \
python3dist-pydash"

RDEPENDS:${PN} += "python-abi"

inherit rpm
