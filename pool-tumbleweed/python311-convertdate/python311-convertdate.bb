SUMMARY = "Module for date conversions from and to Gregorian calendar"
DESCRIPTION = "A Python module for converting between Gregorian dates and other \
calendar systems. Calendars included: Baha'i, French Republican, \
Hebrew, Indian Civil, Islamic, ISO, Julian, Mayan and Persian."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python311-convertdate-2.4.0-1.1.noarch.rpm"
RPM_HASH = "c698beebe8efdf9d7a1aa2886dbae807c70ee59125a3020dac5cb0aa9763da2c51a68e0577cbd7518727f0c6a3c384c5d4e9fa358c08ea034ef67480a7d8314b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-convertdate \
python311-convertdate \
python3dist-convertdate"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyMeeus \
update-alternatives"

inherit rpm
