SUMMARY = "A Python SOAP client based on lxml/requests"
DESCRIPTION = "Python SOAP client based on python-lxml and python-requests"
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python311-zeep-4.1.0-4.7.noarch.rpm"
RPM_HASH = "d0ffd20ed47857633165011f05756132bfcd46e1ee018cdadd8b7576bc2ce4a550d5eec74587394d0ba9a2764cd7c37e3883ebb20bbb0d8a58ac8193c3f8a42b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(zeep) \
python311-zeep \
python3dist(zeep)"

RDEPENDS:${PN} += "python(abi) \
python311-attrs \
python311-cached-property \
python311-isodate \
python311-lxml \
python311-platformdirs \
python311-pytz \
python311-requests \
python311-requests-file \
python311-requests-toolbelt"

inherit rpm
