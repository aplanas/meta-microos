SUMMARY = "Google Cloud Platform gRPC extensions"
DESCRIPTION = "gRPC extensions for Google Cloud Platform."
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "python310-grpcio-gcp-0.2.2-2.1.noarch.rpm"
RPM_HASH = "4041befadb6bbc1ff67f050fae59a8a5e05a862a8a0dc1ef50b7e84e20a8f643370853ef98fc93c955fa521738e1a6c06fcdc076b8923476235b12e5354f8d5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-grpcio-gcp \
python310-grpcio-gcp \
python3dist-grpcio-gcp"

RDEPENDS:${PN} += "python-abi \
python310-grpcio"

inherit rpm
