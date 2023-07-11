SUMMARY = "A Python SOAP client based on lxml/requests"
DESCRIPTION = "Python SOAP client based on python-lxml and python-requests"
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python311-zeep-4.1.0-4.9.noarch.rpm"
RPM_HASH = "eeea463f80b105b6cf896383f5013ba88a586ccdd3983752e35900298b039d09250c9bf112a6bc710626d044501d0bedf877b9428fc47951988be08bacce6961"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zeep \
python3.11dist-zeep \
python311-zeep \
python3dist-zeep"

RDEPENDS:${PN} += "python-abi \
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
