SUMMARY = "Google Cloud Platform gRPC extensions"
DESCRIPTION = "gRPC extensions for Google Cloud Platform."
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "python311-grpcio-gcp-0.2.2-2.1.noarch.rpm"
RPM_HASH = "65fd9a3af7354c15407cef06eb098f1822783df039a3061435d107c02b43e1aaf11d77aaffcf5b2510a394a07e96ced70245f26a0b25a970f8dbb1cbe37d8c6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-grpcio-gcp \
python3.11dist-grpcio-gcp \
python311-grpcio-gcp \
python3dist-grpcio-gcp"

RDEPENDS:${PN} += "python-abi \
python311-grpcio"

inherit rpm
