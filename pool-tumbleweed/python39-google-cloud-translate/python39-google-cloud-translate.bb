SUMMARY = "Google Cloud Translation API client library"
DESCRIPTION = "With `Google Cloud Translation`_, you can dynamically translate text between \
thousands of language pairs. The Google Cloud Translation API lets websites \
and programs integrate with Google Cloud Translation programmatically."
LICENSE = "Apache-2.0"

PV = "3.12.0"

RPM_NAME = "python39-google-cloud-translate-3.12.0-1.1.noarch.rpm"
RPM_HASH = "1eef23f447c9cb4b09cef495d121d60bfed1d304c7e751cce6829e87018686c3be9d81ffa6f173a5187ac64d4d7857900ebd3401cab6a24ae6d305a9a54a22dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-google-cloud-translate \
python39-google-cloud-translate \
python3dist-google-cloud-translate"

RDEPENDS:${PN} += "python-abi \
python39-google-api-core \
python39-google-cloud-core \
python39-proto-plus \
python39-protobuf"

inherit rpm
