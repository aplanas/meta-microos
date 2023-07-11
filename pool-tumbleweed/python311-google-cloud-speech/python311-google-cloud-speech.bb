SUMMARY = "Google Cloud Speech API client library"
DESCRIPTION = "Cloud Speech API converts audio to text by applying neural network models."
LICENSE = "Apache-2.0"

PV = "2.20.0"

RPM_NAME = "python311-google-cloud-speech-2.20.0-1.1.noarch.rpm"
RPM_HASH = "72000c623e1d0a8c8d797f9e5c806b794e7226e835fb90329fabc7c00a7da9f4899d7d347870f05021dcccdfad2556e70b97aeb1e657d24876968a62ab13ecb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-speech \
python3.11dist-google-cloud-speech \
python311-google-cloud-speech \
python3dist-google-cloud-speech"

RDEPENDS:${PN} += "python-abi \
python311-google-api-core \
python311-proto-plus \
python311-protobuf"

inherit rpm
