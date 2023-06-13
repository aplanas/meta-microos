SUMMARY = "An ISO 8601 Date/Time/Duration Parser and Formatter"
DESCRIPTION = "This module implements ISO 8601 date, time and duration parsing. \
The implementation follows ISO8601:2004 standard, and implements only \
date/time representations mentioned in the standard. If something is not \
mentioned there, then it is treated as non existent, and not as an allowed \
option."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python310-isodate-0.6.1-3.1.noarch.rpm"
RPM_HASH = "572d71a9b7b1f98d9cd9703174b83a4c57e2c1a4385fd94b48eba7aa0e029dd6ee6f51395eafa9ff3f9a8dfa11d5bb4fd75193a0df2a049f34ed15d4ed4fe19d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-isodate \
python3.10dist(isodate) \
python310-isodate \
python3dist(isodate)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
