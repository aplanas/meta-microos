SUMMARY = "Python module to parse ISO 8601 dates"
DESCRIPTION = "This module parses the most common forms of ISO 8601 date strings (e.g. \
2007-01-14T20:34:22+00:00) into datetime objects."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-iso8601-1.1.0-2.3.noarch.rpm"
RPM_HASH = "30dd4ad1ea1e4c7845c10d07ebea2db80788148689162895b9b2e9d185b87beeb90025acc4510d1066b4e0d3b41b241a6933aa8ad32826ca87dda12d2df02fe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-iso8601 \
python3.11dist-iso8601 \
python311-iso8601 \
python3dist-iso8601"

RDEPENDS:${PN} += "python-abi"

inherit rpm
