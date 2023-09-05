SUMMARY = "Cloud Key Management Service (KMS) API API client library"
DESCRIPTION = "Cloud Key Management Service (KMS) API API client library"
LICENSE = "Apache-2.0"

PV = "2.19.1"

RPM_NAME = "python311-google-cloud-kms-2.19.1-1.1.noarch.rpm"
RPM_HASH = "94aa5bb3c95d2ebe1e94850bdb5f4936749879f47dad5689fff95b4d407f154653464a50ebb9bb082c2fbfcedca0641c09bfefd0994567093d49edb0896e47c9"
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
