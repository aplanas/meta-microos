SUMMARY = "Python module to parse ISO 8601 dates"
DESCRIPTION = "This module parses the most common forms of ISO 8601 date strings (e.g. \
2007-01-14T20:34:22+00:00) into datetime objects."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-iso8601-1.1.0-2.3.noarch.rpm"
RPM_HASH = "06cdcfe48f8f543ad0f7a09ca53d18ed4a8c5d4eeba1f0d87fc85283f5c0bba0162f55add698a5b6d4b7c4f048aad1d501f74e2287db6d4245e0c262eb4d751a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-iso8601 \
python310-iso8601 \
python3dist-iso8601"

RDEPENDS:${PN} += "python-abi"

inherit rpm
