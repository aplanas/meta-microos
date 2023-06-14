SUMMARY = "A modern/fast Python SOAP client based on lxml / requests"
DESCRIPTION = "A modern/fast Python SOAP client based on lxml / requests"
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python39-softlayer-zeep-5.0.0-1.6.noarch.rpm"
RPM_HASH = "8fd0edae443cdebe94077a0cbeb1a4a306f1163444d3a91ccf078ab096f871d0f69362e722c9f37b207af836a96bbdf4d36c99140d64efc75a2cb2b0bcf6a25c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-softlayer-zeep \
python39-softlayer-zeep \
python39-zeep \
python3dist-softlayer-zeep"

RDEPENDS:${PN} += "python-abi \
python39-attrs \
python39-isodate \
python39-lxml \
python39-platformdirs \
python39-pytz \
python39-requests \
python39-requests-file \
python39-requests-toolbelt"

inherit rpm
