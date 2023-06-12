SUMMARY = "GRPC library for the google-iam-v1 service"
DESCRIPTION = "GRPC library for the google-iam-v1 service"
LICENSE = "Apache-2.0"

PV = "0.12.4"

RPM_NAME = "python310-grpc-google-iam-v1-0.12.4-1.4.noarch.rpm"
RPM_HASH = "5b06d093edd12fd7b897892d81bda355a5bb9d06c4f0a0f14a599ec1e92ae77b78796536716c6082617829481212a14102a9e62b33560046399c60de81fd82d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-grpc-google-iam-v1 \
python3.10dist(grpc-google-iam-v1) \
python310-grpc-google-iam-v1 \
python3dist(grpc-google-iam-v1)"
RDEPENDS:${PN} += "python(abi) \
python310-googleapis-common-protos \
python310-grpcio"

inherit rpm
