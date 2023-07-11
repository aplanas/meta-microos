SUMMARY = "An ISO 8601 Date/Time/Duration Parser and Formatter"
DESCRIPTION = "This module implements ISO 8601 date, time and duration parsing. \
The implementation follows ISO8601:2004 standard, and implements only \
date/time representations mentioned in the standard. If something is not \
mentioned there, then it is treated as non existent, and not as an allowed \
option."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python311-isodate-0.6.1-3.2.noarch.rpm"
RPM_HASH = "290a0d6ee2ec3bb7d1f5715d9d9eae0981fef6c2f1084c3e898fd57f60b1ee6290c42e6a18f735c21c9dd50a4fda9470b3321cfdeca602cc3514b7c0c52c0d8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-isodate \
python3.11dist-isodate \
python311-isodate \
python3dist-isodate"

RDEPENDS:${PN} += "python-abi"

inherit rpm
