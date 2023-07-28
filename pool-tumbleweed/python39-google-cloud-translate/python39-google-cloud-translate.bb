SUMMARY = "Google Cloud Translation API client library"
DESCRIPTION = "With `Google Cloud Translation`_, you can dynamically translate text between \
thousands of language pairs. The Google Cloud Translation API lets websites \
and programs integrate with Google Cloud Translation programmatically."
LICENSE = "Apache-2.0"

PV = "3.11.2"

RPM_NAME = "python39-google-cloud-translate-3.11.2-1.1.noarch.rpm"
RPM_HASH = "dde757a2a83934de01b3a912bfd1c0ef57b11f0316007e72269a44ae78c0db1943f78389c44775f3f5fb424b597eb16993da154e5499539de295f5305a1aab53"
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
