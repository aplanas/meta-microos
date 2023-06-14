SUMMARY = "OpenAPI codec for Core API"
DESCRIPTION = "Python Core API codec for the Open API schema format, also known as 'Swagger'."
LICENSE = "BSD-2-Clause"

PV = "1.3.2"

RPM_NAME = "python310-openapi-codec-1.3.2-2.8.noarch.rpm"
RPM_HASH = "c111b6e5557cd231db5cd6e02c48f056a3dce6033b18980d52e301b2d32bf10bf6febba33edef180df3688b4b5c13d0cccfa398ae6ca78b0be96b77a88c655e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openapi-codec \
python3.10dist-openapi-codec \
python310-openapi-codec \
python3dist-openapi-codec"

RDEPENDS:${PN} += "python-abi \
python310-coreapi"

inherit rpm
