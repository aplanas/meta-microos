SUMMARY = "OpenAPI codec for Core API"
DESCRIPTION = "Python Core API codec for the Open API schema format, also known as 'Swagger'."
LICENSE = "BSD-2-Clause"

PV = "1.3.2"

RPM_NAME = "python39-openapi-codec-1.3.2-2.10.noarch.rpm"
RPM_HASH = "36bfa1c6732d64f1b422af4ae096f29ee5160252354ff0f03e941264ec8bc5fed139a46cc010ed8cb6e47929116adadcda3937b52ca15ce1ded69d256e432994"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-openapi-codec \
python39-openapi-codec \
python3dist-openapi-codec"

RDEPENDS:${PN} += "python-abi \
python39-coreapi"

inherit rpm
