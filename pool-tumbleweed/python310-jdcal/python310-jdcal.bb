SUMMARY = "Julian dates from proleptic Gregorian and Julian calendars"
DESCRIPTION = "This module contains functions for converting between Julian dates and \
calendar dates. \
 \
A function for converting Gregorian calendar dates to Julian dates, and \
another function for converting Julian calendar dates to Julian dates \
are defined. Two functions for the reverse calculations are also \
defined."
LICENSE = "BSD-2-Clause"

PV = "1.4.1"

RPM_NAME = "python310-jdcal-1.4.1-1.14.noarch.rpm"
RPM_HASH = "cbb553e3d8868baec61b5814122605ba2340993285df3712581fe2ae3f92e1c7ea8b971411c8fc7ea3fe047174a591f0173cd871da0cd6a5315bf383742b61c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jdcal \
python3.10dist(jdcal) \
python310-jdcal \
python3dist(jdcal)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
