SUMMARY = "An ISO 8601 Date/Time/Duration Parser and Formatter"
DESCRIPTION = "This module implements ISO 8601 date, time and duration parsing. \
The implementation follows ISO8601:2004 standard, and implements only \
date/time representations mentioned in the standard. If something is not \
mentioned there, then it is treated as non existent, and not as an allowed \
option."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python39-isodate-0.6.1-3.2.noarch.rpm"
RPM_HASH = "3f367ed97b350a2555b8681aa2afea44530eea6cdb795c467e1f835170d614d04d603f3ce71acf1e6e618563cf109e0e813888ae3e595482521a699db465ec68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-isodate \
python39-isodate \
python3dist-isodate"

RDEPENDS:${PN} += "python-abi"

inherit rpm
