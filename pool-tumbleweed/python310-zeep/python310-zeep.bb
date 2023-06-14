SUMMARY = "A Python SOAP client based on lxml/requests"
DESCRIPTION = "Python SOAP client based on python-lxml and python-requests"
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python310-zeep-4.1.0-4.7.noarch.rpm"
RPM_HASH = "38d5c258914eb4ea43dbc5ee38e1e36fa2f12b89f72c7583b4baec0e7ae93cfe753450f6650df9ab0daf9d967639124e4b86dd2fc271f3887d7b6f71e06e29ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zeep \
python3.10dist-zeep \
python310-zeep \
python3dist-zeep"

RDEPENDS:${PN} += "python-abi \
python310-attrs \
python310-cached-property \
python310-isodate \
python310-lxml \
python310-platformdirs \
python310-pytz \
python310-requests \
python310-requests-file \
python310-requests-toolbelt"

inherit rpm
