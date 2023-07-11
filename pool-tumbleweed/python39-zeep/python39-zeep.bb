SUMMARY = "A Python SOAP client based on lxml/requests"
DESCRIPTION = "Python SOAP client based on python-lxml and python-requests"
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python39-zeep-4.1.0-4.9.noarch.rpm"
RPM_HASH = "bd8197f3438bc41ba562195aa31b19310b1a5feca37644170044bf607ae3cf4ae32a1b75159b2f8108f63d9b60c6b957b16d6812144964d7fd0aff98001dcac9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zeep \
python39-zeep \
python3dist-zeep"

RDEPENDS:${PN} += "python-abi \
python39-attrs \
python39-cached-property \
python39-isodate \
python39-lxml \
python39-platformdirs \
python39-pytz \
python39-requests \
python39-requests-file \
python39-requests-toolbelt"

inherit rpm
