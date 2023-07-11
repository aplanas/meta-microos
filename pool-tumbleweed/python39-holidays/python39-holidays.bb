SUMMARY = "Python library for generating holidays on the fly"
DESCRIPTION = "A Python library for generating country, province and state specific sets of holidays on the fly. \
It makes determining whether a specific date is a holiday possible."
LICENSE = "MIT"

PV = "0.20"

RPM_NAME = "python39-holidays-0.20-1.4.noarch.rpm"
RPM_HASH = "47a7cd5e40182e606d45ee0bc3e60d9339fec15a501f6c36f994d5dc0753ec1d390e736aac33446e78540a0a94b885de3962ab335c6163cd428504eacfe30765"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-holidays \
python39-holidays \
python3dist-holidays"

RDEPENDS:${PN} += "python-abi \
python39-convertdate \
python39-hijri-converter \
python39-korean-lunar-calendar \
python39-python-dateutil"

inherit rpm
