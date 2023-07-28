SUMMARY = "Cloud Key Management Service (KMS) API API client library"
DESCRIPTION = "Cloud Key Management Service (KMS) API API client library"
LICENSE = "Apache-2.0"

PV = "2.18.0"

RPM_NAME = "python39-google-cloud-kms-2.18.0-1.1.noarch.rpm"
RPM_HASH = "76a6b64c56c183cda9439b7bdff9500486294d51fea24036b478fbfb845ef25d882cf49dae4c06f24b5ebfb8d829a65d769f6a7c33aa4d3e966a90c49669c8ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-google-cloud-kms \
python39-google-cloud-kms \
python3dist-google-cloud-kms"

RDEPENDS:${PN} += "python-abi \
python39-google-api-core \
python39-grpc-google-iam-v1 \
update-alternatives"

inherit rpm
