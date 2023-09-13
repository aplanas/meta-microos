SUMMARY = "Code coverage measurement for Python"
DESCRIPTION = "Coverage.py measures code coverage, typically during test execution. It uses \
the code analysis tools and tracing hooks provided in the Python standard \
library to determine which lines are executable, and which have been executed."
LICENSE = "Apache-2.0"

PV = "7.3.0"

RPM_NAME = "python311-coverage-7.3.0-2.1.aarch64.rpm"
RPM_HASH = "adee0460dd49c9e0b476a0767ef9e1c93b3b7b73f5c9d5998026013c2b91f94cc828ba03157298edd44bb51e64a746f4610eea194e956d12d240a4e087f32565"

RPROVIDES:${PN} += "python3-coverage \
python3.11dist-coverage \
python311-coverage \
python3dist-coverage"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311 \
update-alternatives"

inherit rpm
