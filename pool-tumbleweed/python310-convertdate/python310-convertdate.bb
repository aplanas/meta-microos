SUMMARY = "Module for date conversions from and to Gregorian calendar"
DESCRIPTION = "A Python module for converting between Gregorian dates and other \
calendar systems. Calendars included: Baha'i, French Republican, \
Hebrew, Indian Civil, Islamic, ISO, Julian, Mayan and Persian."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python310-convertdate-2.4.0-1.1.noarch.rpm"
RPM_HASH = "9c42a454b2e8e493c7d3cf4bdd088b229c93f49694fdf418436d65d83466634a0b3966d1b2fb744e2e757f815661d0371537de6c6a61dedee25e3082587bd896"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-convertdate \
python3.10dist(convertdate) \
python310-convertdate \
python3dist(convertdate)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-PyMeeus \
update-alternatives"

inherit rpm
