SUMMARY = "GRPC library for the google-iam-v1 service"
DESCRIPTION = "GRPC library for the google-iam-v1 service"
LICENSE = "Apache-2.0"

PV = "0.12.4"

RPM_NAME = "python310-grpc-google-iam-v1-0.12.4-1.6.noarch.rpm"
RPM_HASH = "5cbcc5bb39165ae985789629b221257d8af43ec3c87cfd2d477877b567b82b5bb6cb8898a0767e588a653f097f389b76b33840a74e13558ef388eb2b5a47834a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-grpc-google-iam-v1 \
python310-grpc-google-iam-v1 \
python3dist-grpc-google-iam-v1"

RDEPENDS:${PN} += "python-abi \
python310-googleapis-common-protos \
python310-grpcio"

inherit rpm
