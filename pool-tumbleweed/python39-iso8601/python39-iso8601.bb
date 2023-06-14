SUMMARY = "Python module to parse ISO 8601 dates"
DESCRIPTION = "This module parses the most common forms of ISO 8601 date strings (e.g. \
2007-01-14T20:34:22+00:00) into datetime objects."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-iso8601-1.1.0-2.1.noarch.rpm"
RPM_HASH = "7bc18db401eb5a50ddd4f4f0c30823cd96cc36d27474e47bc0aae52c190fa54887d1ec62c7f02a4922ff482aac72ea4a26b9988e297b82fea81ebae00260d993"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-iso8601 \
python39-iso8601 \
python3dist-iso8601"

RDEPENDS:${PN} += "python-abi"

inherit rpm
