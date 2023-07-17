SUMMARY = "A library for parsing ISO 8601 strings"
DESCRIPTION = "aniso8601 is a Python library for parsing date strings \
in ISO 8601 format into datetime format."
LICENSE = "BSD-3-Clause"

PV = "9.0.1"

RPM_NAME = "python39-aniso8601-9.0.1-3.1.noarch.rpm"
RPM_HASH = "fff88a4ca78bce1e2fd23c2f750283c9630beedae134ec600249122d32d6d0a4a28997615bf141e55cc3163d631d56a76f28a0da6e78aa3f9c9b9f36ee334918"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aniso8601 \
python39-aniso8601 \
python3dist-aniso8601"

RDEPENDS:${PN} += "python-abi"

inherit rpm
