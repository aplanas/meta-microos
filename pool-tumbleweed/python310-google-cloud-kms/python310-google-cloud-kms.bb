SUMMARY = "Cloud Key Management Service (KMS) API API client library"
DESCRIPTION = "Cloud Key Management Service (KMS) API API client library"
LICENSE = "Apache-2.0"

PV = "2.17.0"

RPM_NAME = "python310-google-cloud-kms-2.17.0-1.3.noarch.rpm"
RPM_HASH = "f36b0a48979facddce6f3f9d69cc007f925fc68e46d40535cea5edf024489ffd74cc07f190333ee18d14d7ee77bdf7950964714031141d27f2812b7fc0df270c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-google-cloud-kms \
python310-google-cloud-kms \
python3dist-google-cloud-kms"

RDEPENDS:${PN} += "python-abi \
python310-google-api-core \
python310-grpc-google-iam-v1 \
update-alternatives"

inherit rpm
