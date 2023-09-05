SUMMARY = "Google Cloud Translation API client library"
DESCRIPTION = "With `Google Cloud Translation`_, you can dynamically translate text between \
thousands of language pairs. The Google Cloud Translation API lets websites \
and programs integrate with Google Cloud Translation programmatically."
LICENSE = "Apache-2.0"

PV = "3.12.0"

RPM_NAME = "python310-google-cloud-translate-3.12.0-1.1.noarch.rpm"
RPM_HASH = "69ee082e1f7803b6b2e6e5b309b49f51cc2b30b0e15926c7645a631a66ca39548dd5972a9ae578db490dba4e7751700111095e6608bbd0e59bc2b18ed9335d09"
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
