SUMMARY = "Google Cloud Speech API client library"
DESCRIPTION = "Cloud Speech API converts audio to text by applying neural network models."
LICENSE = "Apache-2.0"

PV = "2.20.0"

RPM_NAME = "python310-google-cloud-speech-2.20.0-1.1.noarch.rpm"
RPM_HASH = "3a96bb9400f491f70d639ca6fbc8214926547452d0985c869a46f324dcab53b559042801f4afaaddd75ac889a4581c9dc071c1d56a74151ed40114caea696112"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-google-cloud-speech \
python310-google-cloud-speech \
python3dist-google-cloud-speech"

RDEPENDS:${PN} += "python-abi \
python310-google-api-core \
python310-proto-plus \
python310-protobuf"

inherit rpm
