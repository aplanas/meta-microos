SUMMARY = "Google Cloud Translation API client library"
DESCRIPTION = "With `Google Cloud Translation`_, you can dynamically translate text between \
thousands of language pairs. The Google Cloud Translation API lets websites \
and programs integrate with Google Cloud Translation programmatically."
LICENSE = "Apache-2.0"

PV = "3.11.1"

RPM_NAME = "python39-google-cloud-translate-3.11.1-1.1.noarch.rpm"
RPM_HASH = "6ed46abef1b472fb2b83965c609f21ae50bca53291483f96f018c4c9cbb65cdab9e9f61119791d139bc27bd3c0e0c0879d20d155c8870357c5b91a2feb9e7bfc"
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
