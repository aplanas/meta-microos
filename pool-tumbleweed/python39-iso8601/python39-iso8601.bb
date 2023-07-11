SUMMARY = "Python module to parse ISO 8601 dates"
DESCRIPTION = "This module parses the most common forms of ISO 8601 date strings (e.g. \
2007-01-14T20:34:22+00:00) into datetime objects."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-iso8601-1.1.0-2.3.noarch.rpm"
RPM_HASH = "9e11348651f49db8266be5191a7910665de969972763eaac32b04c54325dfb47ea017a3eb7d8813e92eb13f61dc75ebc958263e8c69e782f621d9a7c27d6eb87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-iso8601 \
python39-iso8601 \
python3dist-iso8601"

RDEPENDS:${PN} += "python-abi"

inherit rpm
