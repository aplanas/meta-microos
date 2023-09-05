SUMMARY = "Google Cloud Translation API client library"
DESCRIPTION = "With `Google Cloud Translation`_, you can dynamically translate text between \
thousands of language pairs. The Google Cloud Translation API lets websites \
and programs integrate with Google Cloud Translation programmatically."
LICENSE = "Apache-2.0"

PV = "3.12.0"

RPM_NAME = "python311-google-cloud-translate-3.12.0-1.1.noarch.rpm"
RPM_HASH = "267f4bb4d8ff37e80172c23eedd31583fd0da7b7bef0e04aeacfa6061a902f4293c1a83f7bdc3fc37ac70e2fe4443d0a4f2b55078dea323252c1963ed059c61d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-translate \
python3.11dist-google-cloud-translate \
python311-google-cloud-translate \
python3dist-google-cloud-translate"

RDEPENDS:${PN} += "python-abi \
python311-google-api-core \
python311-google-cloud-core \
python311-proto-plus \
python311-protobuf"

inherit rpm
