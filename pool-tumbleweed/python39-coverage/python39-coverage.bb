SUMMARY = "Code coverage measurement for Python"
DESCRIPTION = "Coverage.py measures code coverage, typically during test execution. It uses \
the code analysis tools and tracing hooks provided in the Python standard \
library to determine which lines are executable, and which have been executed."
LICENSE = "Apache-2.0"

PV = "7.2.5"

RPM_NAME = "python39-coverage-7.2.5-1.3.aarch64.rpm"
RPM_HASH = "6965ff780b28c6adf91b2a18a550f422e0414568b6578f6d3ef453adc0eb9d7410fc2d47d104496ec50dacb85ddf3f1c6e2c98b30b3bde8f154832cb4960907d"

RPROVIDES:${PN} += "python3.9dist-coverage \
python39-coverage \
python3dist-coverage"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39 \
update-alternatives"

inherit rpm
