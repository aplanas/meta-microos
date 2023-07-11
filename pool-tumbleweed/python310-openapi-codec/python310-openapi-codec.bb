SUMMARY = "OpenAPI codec for Core API"
DESCRIPTION = "Python Core API codec for the Open API schema format, also known as 'Swagger'."
LICENSE = "BSD-2-Clause"

PV = "1.3.2"

RPM_NAME = "python310-openapi-codec-1.3.2-2.10.noarch.rpm"
RPM_HASH = "0eb12e9028d439a2f010049db49aeecf0b08104e9c0905096e2d9ff77f0e632be52a3565d57c3daa11b24e23b3d219118cd95765a4da0c5ec8fd85359d4f11f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-openapi-codec \
python310-openapi-codec \
python3dist-openapi-codec"

RDEPENDS:${PN} += "python-abi \
python310-coreapi"

inherit rpm
