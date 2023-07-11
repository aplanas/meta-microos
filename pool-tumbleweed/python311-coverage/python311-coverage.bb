SUMMARY = "Code coverage measurement for Python"
DESCRIPTION = "Coverage.py measures code coverage, typically during test execution. It uses \
the code analysis tools and tracing hooks provided in the Python standard \
library to determine which lines are executable, and which have been executed."
LICENSE = "Apache-2.0"

PV = "7.2.5"

RPM_NAME = "python311-coverage-7.2.5-1.3.aarch64.rpm"
RPM_HASH = "829815ded1469a2a4a4e8ef6ba80bb8801339a00aa73b68e72b51c369f70c5b66f40f2b9dc87a6943e20d12f880c86fbbee68345d2bf3deccc015c2bccb78e53"

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
