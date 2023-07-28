SUMMARY = "Google Cloud Speech API client library"
DESCRIPTION = "Cloud Speech API converts audio to text by applying neural network models."
LICENSE = "Apache-2.0"

PV = "2.21.0"

RPM_NAME = "python311-google-cloud-speech-2.21.0-1.1.noarch.rpm"
RPM_HASH = "0684ab22caada0ad0d7da3cbeb76a50a74d10089f182e85bbe1fb05567067a4fd0c521fa1d5f4509e96b3a722feab0d1bfebedc8ff7ca39874e8edcb6995327d"
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
