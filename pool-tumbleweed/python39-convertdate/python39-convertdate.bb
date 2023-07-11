SUMMARY = "Module for date conversions from and to Gregorian calendar"
DESCRIPTION = "A Python module for converting between Gregorian dates and other \
calendar systems. Calendars included: Baha'i, French Republican, \
Hebrew, Indian Civil, Islamic, ISO, Julian, Mayan and Persian."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python39-convertdate-2.4.0-1.3.noarch.rpm"
RPM_HASH = "a394ec8fa97cb693ba483bd51d42a34079852c97d274ac4d665bc0b2e2658478f2c1456e4a3eae8a6c5e3db3abc2cdec7d4ce146738ad2fc55f031b31004cb86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-convertdate \
python39-convertdate \
python3dist-convertdate"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyMeeus \
update-alternatives"

inherit rpm
