SUMMARY = "Cloud Key Management Service (KMS) API API client library"
DESCRIPTION = "Cloud Key Management Service (KMS) API API client library"
LICENSE = "Apache-2.0"

PV = "2.19.1"

RPM_NAME = "python39-google-cloud-kms-2.19.1-1.1.noarch.rpm"
RPM_HASH = "e17f2c095560716fc0ce63cbf1788ecfbb19c09cdb125d0a2b55700f09145a82a31ff07c901df4033f903b550ef4abd1fd75d5a882ab5c2de915dbd2756ee396"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-google-cloud-kms \
python39-google-cloud-kms \
python3dist-google-cloud-kms"

RDEPENDS:${PN} += "python-abi \
python39-google-api-core \
python39-grpc-google-iam-v1 \
update-alternatives"

inherit rpm
