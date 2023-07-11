SUMMARY = "Module for date conversions from and to Gregorian calendar"
DESCRIPTION = "A Python module for converting between Gregorian dates and other \
calendar systems. Calendars included: Baha'i, French Republican, \
Hebrew, Indian Civil, Islamic, ISO, Julian, Mayan and Persian."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python310-convertdate-2.4.0-1.3.noarch.rpm"
RPM_HASH = "8feab9d5b239228700aef203bc79709d3676d0ace6db5e3877dac16a981dc1b04aaee81d1c6d53f8e5245f73b56b7afa2bc1e8968be87043ce4274faf2b5ac5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-convertdate \
python310-convertdate \
python3dist-convertdate"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyMeeus \
update-alternatives"

inherit rpm
