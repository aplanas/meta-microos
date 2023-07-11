SUMMARY = "Cloud Key Management Service (KMS) API API client library"
DESCRIPTION = "Cloud Key Management Service (KMS) API API client library"
LICENSE = "Apache-2.0"

PV = "2.17.0"

RPM_NAME = "python39-google-cloud-kms-2.17.0-1.3.noarch.rpm"
RPM_HASH = "6a3895730f18ea5ca0e6854c7162ed99e82597b3856b90a9c3797d2fdf914db67e07b3c16c1845ac585503f5355aaa69d1f1fb0d9a6270c3665ed85198663e3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-google-cloud-kms \
python39-google-cloud-kms \
python3dist-google-cloud-kms"

RDEPENDS:${PN} += "python-abi \
python39-google-api-core \
python39-grpc-google-iam-v1 \
update-alternatives"

inherit rpm
