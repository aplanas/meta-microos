SUMMARY = "Google Cloud Translation API client library"
DESCRIPTION = "With `Google Cloud Translation`_, you can dynamically translate text between \
thousands of language pairs. The Google Cloud Translation API lets websites \
and programs integrate with Google Cloud Translation programmatically."
LICENSE = "Apache-2.0"

PV = "3.11.1"

RPM_NAME = "python310-google-cloud-translate-3.11.1-1.1.noarch.rpm"
RPM_HASH = "0ae7a52089dae5c87415e6a9686083d369a6456ae6ba9bcb1ebc665f51e29fa509c8f24362e96287ae85eeb0a5937e2492af890d4cafd9127a72f348c1276525"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-google-cloud-translate \
python310-google-cloud-translate \
python3dist-google-cloud-translate"

RDEPENDS:${PN} += "python-abi \
python310-google-api-core \
python310-google-cloud-core \
python310-proto-plus \
python310-protobuf"

inherit rpm
