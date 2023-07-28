SUMMARY = "Cloud Key Management Service (KMS) API API client library"
DESCRIPTION = "Cloud Key Management Service (KMS) API API client library"
LICENSE = "Apache-2.0"

PV = "2.18.0"

RPM_NAME = "python310-google-cloud-kms-2.18.0-1.1.noarch.rpm"
RPM_HASH = "d481b4302f30b8a863508ca5881bd16573599bc46021e2b7e9151569b2c6cf60d033cd12030a566de2d3dc0e9fcd1798cf164b459bbf8e2a176e752e28834dad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-google-cloud-kms \
python310-google-cloud-kms \
python3dist-google-cloud-kms"

RDEPENDS:${PN} += "python-abi \
python310-google-api-core \
python310-grpc-google-iam-v1 \
update-alternatives"

inherit rpm
