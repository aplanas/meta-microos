SUMMARY = "Cirq package for Google Quantum Computing Service1"
DESCRIPTION = "A Cirq module that provides tools and access to the Google Quantum Computing Service"
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python310-cirq-google-0.13.1-1.5.noarch.rpm"
RPM_HASH = "bd95445d85d931f06028f688f6ef890c4ab8702a8d8a4764ed5f50005f19735794a9cc2f8d23fe2dc5fe665e2cde840fa03429b309209471672bb779b344b5c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cirq-google \
python3.10dist(cirq-google) \
python310-cirq-google \
python3dist(cirq-google)"

RDEPENDS:${PN} += "python(abi) \
python310-cirq-core \
python310-google-api-core \
python310-grpcio \
python310-protobuf"

inherit rpm
