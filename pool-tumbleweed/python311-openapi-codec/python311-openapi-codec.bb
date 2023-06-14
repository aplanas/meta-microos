SUMMARY = "OpenAPI codec for Core API"
DESCRIPTION = "Python Core API codec for the Open API schema format, also known as 'Swagger'."
LICENSE = "BSD-2-Clause"

PV = "1.3.2"

RPM_NAME = "python311-openapi-codec-1.3.2-2.8.noarch.rpm"
RPM_HASH = "1c6d8f9d5c017d265db921b52c39b875ca929c9928d74144957a3120f51fdefbb224323319aeca5c67e0f27f85a4deed80610bb3a1da1df4474fe0e80f9500c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-openapi-codec \
python311-openapi-codec \
python3dist-openapi-codec"

RDEPENDS:${PN} += "python-abi \
python311-coreapi"

inherit rpm
