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

RPM_NAME = "python310-jdcal-1.4.1-1.16.noarch.rpm"
RPM_HASH = "634eb7fcc9872a189611770471b78e2ac636af12af8abf398b6ef9a99362f8cac3f3ccd5937766a38cfd4256134f8e7c89cf4725bab1763ca70ee801614cc396"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jdcal \
python310-jdcal \
python3dist-jdcal"

RDEPENDS:${PN} += "python-abi"

inherit rpm
