SUMMARY = "An ISO 8601 Date/Time/Duration Parser and Formatter"
DESCRIPTION = "This module implements ISO 8601 date, time and duration parsing. \
The implementation follows ISO8601:2004 standard, and implements only \
date/time representations mentioned in the standard. If something is not \
mentioned there, then it is treated as non existent, and not as an allowed \
option."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python39-isodate-0.6.1-3.1.noarch.rpm"
RPM_HASH = "df86d24db50c418daaa8a91e614a5d12038f48695df844772705679ac5f0a79557276013e9cfe6b6f566aeca249ee1f1ff7b3c815502cfd1f55b330b2f564569"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(isodate) \
python39-isodate \
python3dist(isodate)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
