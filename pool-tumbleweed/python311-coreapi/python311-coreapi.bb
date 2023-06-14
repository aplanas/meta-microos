SUMMARY = "Python client library for Core API"
DESCRIPTION = "Python client library for Core API, a format-independent Document Object Model \
for representing Web APIs."
LICENSE = "BSD-2-Clause"

PV = "2.3.3"

RPM_NAME = "python311-coreapi-2.3.3-1.22.noarch.rpm"
RPM_HASH = "7cc0e95d0713c938f2e83ef0fc739eb64d803f758981aa06af5968207fa40a12dc23920f98ee019e48f3f6f422b6283357af4c87c08df9106607a9e4f5c6f63b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-coreapi \
python311-coreapi \
python3dist-coreapi"

RDEPENDS:${PN} += "python-abi \
python311-coreschema \
python311-itypes \
python311-requests \
python311-uritemplate"

inherit rpm
