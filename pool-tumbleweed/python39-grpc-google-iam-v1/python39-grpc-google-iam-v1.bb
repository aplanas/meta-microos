SUMMARY = "GRPC library for the google-iam-v1 service"
DESCRIPTION = "GRPC library for the google-iam-v1 service"
LICENSE = "Apache-2.0"

PV = "0.12.4"

RPM_NAME = "python39-grpc-google-iam-v1-0.12.4-1.6.noarch.rpm"
RPM_HASH = "3eddda3f33f9e3784ec3df0edd667c24e61d90fc902640515e3d4254033f765fc4e5cf567d04ce735d2a1c95ff1f477c5c334ccca80af5ec39363c9e7f842bd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-grpc-google-iam-v1 \
python39-grpc-google-iam-v1 \
python3dist-grpc-google-iam-v1"

RDEPENDS:${PN} += "python-abi \
python39-googleapis-common-protos \
python39-grpcio"

inherit rpm
