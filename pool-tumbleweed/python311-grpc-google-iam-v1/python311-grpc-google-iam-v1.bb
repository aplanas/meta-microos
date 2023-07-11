SUMMARY = "GRPC library for the google-iam-v1 service"
DESCRIPTION = "GRPC library for the google-iam-v1 service"
LICENSE = "Apache-2.0"

PV = "0.12.4"

RPM_NAME = "python311-grpc-google-iam-v1-0.12.4-1.6.noarch.rpm"
RPM_HASH = "6ebb61ec140f79f6cf138c6259651fc28866fdf69b64a1dd329665c43ca9e251aea96fa699e6a939b8bb731568f8cdaf77a72f550d2decffd8fe3fa1bf29cb63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-grpc-google-iam-v1 \
python3.11dist-grpc-google-iam-v1 \
python311-grpc-google-iam-v1 \
python3dist-grpc-google-iam-v1"

RDEPENDS:${PN} += "python-abi \
python311-googleapis-common-protos \
python311-grpcio"

inherit rpm
