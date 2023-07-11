SUMMARY = "Google Cloud Platform gRPC extensions"
DESCRIPTION = "gRPC extensions for Google Cloud Platform."
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "python39-grpcio-gcp-0.2.2-2.1.noarch.rpm"
RPM_HASH = "c0309a488f6addc2a13a144a96a0e8c2f74a0652b3b91ba7a6e43c0d9cc559845354c124e69b6ac136926ee52ce78067c54d558c4c994237dea1e1adc06455fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-grpcio-gcp \
python39-grpcio-gcp \
python3dist-grpcio-gcp"

RDEPENDS:${PN} += "python-abi \
python39-grpcio"

inherit rpm
