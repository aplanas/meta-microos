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

RPM_NAME = "python39-jdcal-1.4.1-1.14.noarch.rpm"
RPM_HASH = "1e0f54e03290f5ce6ad58a086a627506aa6f6b7117f0e0c94359abbf093c2d63f6ce88b691b1296e6b45281456104d5bc31454dce2531055bc04280d72961cdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jdcal) \
python39-jdcal \
python3dist(jdcal)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
