SUMMARY = "Code coverage measurement for Python"
DESCRIPTION = "Coverage.py measures code coverage, typically during test execution. It uses \
the code analysis tools and tracing hooks provided in the Python standard \
library to determine which lines are executable, and which have been executed."
LICENSE = "Apache-2.0"

PV = "7.3.0"

RPM_NAME = "python311-coverage-7.3.0-1.1.aarch64.rpm"
RPM_HASH = "22974a94c71b5daea7d3e284228f2613ae9ee79b2c275104e83ba93128d655a2884831158333183cbba28df4186e2225e9915188fd493126002f338fc23cf6e9"

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
