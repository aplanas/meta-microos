SUMMARY = "Google Cloud Speech API client library"
DESCRIPTION = "Cloud Speech API converts audio to text by applying neural network models."
LICENSE = "Apache-2.0"

PV = "2.21.0"

RPM_NAME = "python310-google-cloud-speech-2.21.0-1.1.noarch.rpm"
RPM_HASH = "4ae8c71d290fb5a5fbacc8d994fe03b22150f5c25e10614388fc610a22af32d13458b73e78ff4a93b8f548a32632ef63b37ae401ca55bddcedef143439f880fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-google-cloud-speech \
python310-google-cloud-speech \
python3dist-google-cloud-speech"

RDEPENDS:${PN} += "python-abi \
python310-google-api-core \
python310-proto-plus \
python310-protobuf"

inherit rpm
