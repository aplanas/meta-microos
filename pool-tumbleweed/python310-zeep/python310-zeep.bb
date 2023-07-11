SUMMARY = "A Python SOAP client based on lxml/requests"
DESCRIPTION = "Python SOAP client based on python-lxml and python-requests"
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python310-zeep-4.1.0-4.9.noarch.rpm"
RPM_HASH = "76ce678f58deed9af35832ac5c504837d790503265b06c12799be4a10d724d26a0461fa16bc067834697346340fd0722cc510d8ca90cf32f01e545031505d2bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zeep \
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
