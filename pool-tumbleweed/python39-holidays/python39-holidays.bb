SUMMARY = "Python library for generating holidays on the fly"
DESCRIPTION = "A Python library for generating country, province and state specific sets of holidays on the fly. \
It makes determining whether a specific date is a holiday possible."
LICENSE = "MIT"

PV = "0.20"

RPM_NAME = "python39-holidays-0.20-1.2.noarch.rpm"
RPM_HASH = "98de6fdd2dcfe5cea84dbf5c87e2bc3a648bb322efb9b2d7bd56c7795a8b5b8bfe89738ee0d70b68b4d08b7e83d5416832c0d5913caa50cc9fcfb3474c1585ea"
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
