SUMMARY = "Google Cloud Translation API client library"
DESCRIPTION = "With `Google Cloud Translation`_, you can dynamically translate text between \
thousands of language pairs. The Google Cloud Translation API lets websites \
and programs integrate with Google Cloud Translation programmatically."
LICENSE = "Apache-2.0"

PV = "3.11.2"

RPM_NAME = "python310-google-cloud-translate-3.11.2-1.1.noarch.rpm"
RPM_HASH = "0f92cda1754bdde69cb6af2a1c4596b41bf141951663b2a62743c40374a8d2f79bce25823489df85764d46210855d03d35c2f758e468f7a22a3008e0169c4661"
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
