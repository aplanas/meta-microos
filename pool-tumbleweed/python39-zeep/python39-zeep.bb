SUMMARY = "A Python SOAP client based on lxml/requests"
DESCRIPTION = "Python SOAP client based on python-lxml and python-requests"
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python39-zeep-4.1.0-4.7.noarch.rpm"
RPM_HASH = "0dcbf9e0b413a47f65f5d1b43d46449cc7abc1876bfd7c25f31dee942edbf91ff047c14334c36d2362c454e68854e6f0d1063cba542984601713456d43f49664"
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
