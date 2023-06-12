SUMMARY = "Google Cloud Speech API client library"
DESCRIPTION = "Cloud Speech API converts audio to text by applying neural network models."
LICENSE = "Apache-2.0"

PV = "2.19.0"

RPM_NAME = "python39-google-cloud-speech-2.19.0-1.2.noarch.rpm"
RPM_HASH = "9f353afc2a6522bb23b2e6b8d4d5577bcf75f6e4d8f9b3943a5afe7856b907dd6c1b311bb25e96045b2f6054c05724f394a7072dd3146081a90f74f404341aa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(google-cloud-speech) \
python39-google-cloud-speech \
python3dist(google-cloud-speech)"
RDEPENDS:${PN} += "python(abi) \
python39-google-api-core \
python39-proto-plus \
python39-protobuf"

inherit rpm
