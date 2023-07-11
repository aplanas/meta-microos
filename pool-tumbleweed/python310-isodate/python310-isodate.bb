SUMMARY = "An ISO 8601 Date/Time/Duration Parser and Formatter"
DESCRIPTION = "This module implements ISO 8601 date, time and duration parsing. \
The implementation follows ISO8601:2004 standard, and implements only \
date/time representations mentioned in the standard. If something is not \
mentioned there, then it is treated as non existent, and not as an allowed \
option."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python310-isodate-0.6.1-3.2.noarch.rpm"
RPM_HASH = "ef1da7d8fb942278073458b49075422fbde88a6b4d444d4c747042cdcc0b2f342286b8a7748dd0c3fa9021d061c01fd0592b38b494b1d0ac7bf3ab5d2e6a79cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-isodate \
python310-isodate \
python3dist-isodate"

RDEPENDS:${PN} += "python-abi"

inherit rpm
