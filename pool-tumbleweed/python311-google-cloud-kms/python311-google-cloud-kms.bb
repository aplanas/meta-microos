SUMMARY = "Cloud Key Management Service (KMS) API API client library"
DESCRIPTION = "Cloud Key Management Service (KMS) API API client library"
LICENSE = "Apache-2.0"

PV = "2.18.0"

RPM_NAME = "python311-google-cloud-kms-2.18.0-1.1.noarch.rpm"
RPM_HASH = "a12007e8fbabd9cf4f209013b1160b64c9b84030ecd0479690744bd837c3b6b1e78976da60454d5d2dd9254523896a29fb3a9b57535f013cdb0567bc5478e900"
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
