SUMMARY = "Cloud Key Management Service (KMS) API API client library"
DESCRIPTION = "Cloud Key Management Service (KMS) API API client library"
LICENSE = "Apache-2.0"

PV = "2.17.0"

RPM_NAME = "python311-google-cloud-kms-2.17.0-1.3.noarch.rpm"
RPM_HASH = "a2b75bf4fe3d15e702785acf79c1403b62b0b9aba49a2dbc85d99bd35b70dd033355561318816e82090c8ea56929a19cec30a3f474b50782846e6d0176b82b8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-kms \
python3.11dist-google-cloud-kms \
python311-google-cloud-kms \
python3dist-google-cloud-kms"

RDEPENDS:${PN} += "python-abi \
python311-google-api-core \
python311-grpc-google-iam-v1 \
update-alternatives"

inherit rpm
