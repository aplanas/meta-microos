SUMMARY = "A modern/fast Python SOAP client based on lxml / requests"
DESCRIPTION = "A modern/fast Python SOAP client based on lxml / requests"
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python39-softlayer-zeep-5.0.0-2.1.noarch.rpm"
RPM_HASH = "108aba9d6712396e5e695598f6b43589cbfd31cfb8f2b74f68e482254818f88c8174bbdc28ed31797a3c883c1f9ed425b323c801d2bad5b8fa1cbc87030f1257"
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
