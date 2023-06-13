SUMMARY = "Google Cloud Translation API client library"
DESCRIPTION = "With `Google Cloud Translation`_, you can dynamically translate text between \
thousands of language pairs. The Google Cloud Translation API lets websites \
and programs integrate with Google Cloud Translation programmatically."
LICENSE = "Apache-2.0"

PV = "3.11.0"

RPM_NAME = "python310-google-cloud-translate-3.11.0-1.2.noarch.rpm"
RPM_HASH = "dfc38a4768192e49c6ae51fe4f73c3e3c71d7ec7b32a74192ec07c835fbcc73e21992817a0e2ced9f1c7c1b9ccc52e28a8d6d0b6b581ca22e525876f00a496e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-translate \
python3.10dist(google-cloud-translate) \
python310-google-cloud-translate \
python3dist(google-cloud-translate)"

RDEPENDS:${PN} += "python(abi) \
python310-google-api-core \
python310-google-cloud-core \
python310-proto-plus \
python310-protobuf"

inherit rpm
