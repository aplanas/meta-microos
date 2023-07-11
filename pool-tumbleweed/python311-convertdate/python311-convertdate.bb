SUMMARY = "Module for date conversions from and to Gregorian calendar"
DESCRIPTION = "A Python module for converting between Gregorian dates and other \
calendar systems. Calendars included: Baha'i, French Republican, \
Hebrew, Indian Civil, Islamic, ISO, Julian, Mayan and Persian."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python311-convertdate-2.4.0-1.3.noarch.rpm"
RPM_HASH = "041df8618692cca31e7babdfa5a9ba3cceec96726ce45291786ca5f1c69e87cb268e02c3df6035d265b8c790ee9de209e615b8ea18426fb7d582186b94de78c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-convertdate \
python3.11dist-convertdate \
python311-convertdate \
python3dist-convertdate"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyMeeus \
update-alternatives"

inherit rpm
