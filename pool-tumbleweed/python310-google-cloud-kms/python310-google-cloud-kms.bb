SUMMARY = "Cloud Key Management Service (KMS) API API client library"
DESCRIPTION = "Cloud Key Management Service (KMS) API API client library"
LICENSE = "Apache-2.0"

PV = "2.19.1"

RPM_NAME = "python310-google-cloud-kms-2.19.1-1.1.noarch.rpm"
RPM_HASH = "b3f13661f2a81cfe12253861c52c7599bd11f254c5f51a3b3fcb1db4d0e73f6475868e488c473224038403e298fb512833e7488e26eaff6ffa250473704b8a57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-google-cloud-kms \
python310-google-cloud-kms \
python3dist-google-cloud-kms"

RDEPENDS:${PN} += "python-abi \
python310-google-api-core \
python310-grpc-google-iam-v1 \
update-alternatives"

inherit rpm
