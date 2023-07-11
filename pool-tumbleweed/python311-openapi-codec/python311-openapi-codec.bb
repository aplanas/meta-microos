SUMMARY = "OpenAPI codec for Core API"
DESCRIPTION = "Python Core API codec for the Open API schema format, also known as 'Swagger'."
LICENSE = "BSD-2-Clause"

PV = "1.3.2"

RPM_NAME = "python311-openapi-codec-1.3.2-2.10.noarch.rpm"
RPM_HASH = "fd870a46d121d789d651f1813fa9ff486e1f647e481cdae57492db1ec9cb53deab30cf7039162d0c185f19f719638986a82af799fe29c7925b68f787ea46cda5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openapi-codec \
python3.11dist-openapi-codec \
python311-openapi-codec \
python3dist-openapi-codec"

RDEPENDS:${PN} += "python-abi \
python311-coreapi"

inherit rpm
