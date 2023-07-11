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

RPM_NAME = "python39-jdcal-1.4.1-1.16.noarch.rpm"
RPM_HASH = "37402ead4b8192233a3aeb490b774576333c052878801f151c7d40198a596495ec162ccf85cd936e5d56a2379d7e04aaf11c33379509ac787efa75ee95cfbc89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jdcal \
python39-jdcal \
python3dist-jdcal"

RDEPENDS:${PN} += "python-abi"

inherit rpm
