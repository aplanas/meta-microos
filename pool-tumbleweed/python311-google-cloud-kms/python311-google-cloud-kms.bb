SUMMARY = "Cloud Key Management Service (KMS) API API client library"
DESCRIPTION = "Cloud Key Management Service (KMS) API API client library"
LICENSE = "Apache-2.0"

PV = "2.17.0"

RPM_NAME = "python311-google-cloud-kms-2.17.0-1.1.noarch.rpm"
RPM_HASH = "0f44f259ed9952c1e430150d100e82785e5ee8006e15b89b82660f97119c84973f6c9fb4a09b44671414781bf29c07ab758016ed556581b3beb38dd7550450be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(google-cloud-kms) \
python311-google-cloud-kms \
python3dist(google-cloud-kms)"
RDEPENDS:${PN} += "python(abi) \
python311-google-api-core \
python311-grpc-google-iam-v1 \
update-alternatives"

inherit rpm
