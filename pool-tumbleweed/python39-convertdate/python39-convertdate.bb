SUMMARY = "Module for date conversions from and to Gregorian calendar"
DESCRIPTION = "A Python module for converting between Gregorian dates and other \
calendar systems. Calendars included: Baha'i, French Republican, \
Hebrew, Indian Civil, Islamic, ISO, Julian, Mayan and Persian."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python39-convertdate-2.4.0-1.1.noarch.rpm"
RPM_HASH = "c3570fdf364052291e49c5fabe2cc15de97e3dedee2f4010bec488b79444a68eeaa9b9c7620dd931c5e4547db732c6c0b1b12ea16ecd831197c02e946b1a57f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-convertdate \
python39-convertdate \
python3dist-convertdate"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-PyMeeus \
update-alternatives"

inherit rpm
