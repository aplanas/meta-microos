SUMMARY = "Google Cloud Speech API client library"
DESCRIPTION = "Cloud Speech API converts audio to text by applying neural network models."
LICENSE = "Apache-2.0"

PV = "2.21.0"

RPM_NAME = "python39-google-cloud-speech-2.21.0-1.1.noarch.rpm"
RPM_HASH = "a79db1ae4925adf35e969d37112e7efb8cb13417036da31f611f703eb23564d7aee6dfb034b0bd0457d5153a818d6bcfedf91d65de9fa199261b89b10e805e3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-google-cloud-speech \
python39-google-cloud-speech \
python3dist-google-cloud-speech"

RDEPENDS:${PN} += "python-abi \
python39-google-api-core \
python39-proto-plus \
python39-protobuf"

inherit rpm
