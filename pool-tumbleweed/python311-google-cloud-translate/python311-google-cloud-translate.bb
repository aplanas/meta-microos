SUMMARY = "Google Cloud Translation API client library"
DESCRIPTION = "With `Google Cloud Translation`_, you can dynamically translate text between \
thousands of language pairs. The Google Cloud Translation API lets websites \
and programs integrate with Google Cloud Translation programmatically."
LICENSE = "Apache-2.0"

PV = "3.11.1"

RPM_NAME = "python311-google-cloud-translate-3.11.1-1.1.noarch.rpm"
RPM_HASH = "030626d888c8fd67af098d7232c7e693041272913f22fc72325b0310d63d79a9db7b2c64091372d1cf02051397508bf7102ac7cfa9234b6eac4a475a04dcc9cd"
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
