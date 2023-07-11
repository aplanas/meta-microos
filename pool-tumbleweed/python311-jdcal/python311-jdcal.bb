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

RPM_NAME = "python311-jdcal-1.4.1-1.16.noarch.rpm"
RPM_HASH = "355d6bf775b7a4cfb990e6570ce88dd692fdba7678a486f48466af5d250fbfbd9b55596f16d7cd08f54a8a0c15f3d302538f41fed72bfe10d87b7e17c70f57a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jdcal \
python3.11dist-jdcal \
python311-jdcal \
python3dist-jdcal"

RDEPENDS:${PN} += "python-abi"

inherit rpm
