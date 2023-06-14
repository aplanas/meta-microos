SUMMARY = "GRPC library for the google-iam-v1 service"
DESCRIPTION = "GRPC library for the google-iam-v1 service"
LICENSE = "Apache-2.0"

PV = "0.12.4"

RPM_NAME = "python39-grpc-google-iam-v1-0.12.4-1.4.noarch.rpm"
RPM_HASH = "d4cb272199ec46d46fed94cc33689dcee2d5ffa32accd84dd24fc98a5c8d9f320f76baaa13d8697bb425b8bc2ecb8c550977985ce4fe189c014a702b8bbf0058"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-grpc-google-iam-v1 \
python39-grpc-google-iam-v1 \
python3dist-grpc-google-iam-v1"

RDEPENDS:${PN} += "python-abi \
python39-googleapis-common-protos \
python39-grpcio"

inherit rpm
