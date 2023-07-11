SUMMARY = "Code coverage measurement for Python"
DESCRIPTION = "Coverage.py measures code coverage, typically during test execution. It uses \
the code analysis tools and tracing hooks provided in the Python standard \
library to determine which lines are executable, and which have been executed."
LICENSE = "Apache-2.0"

PV = "7.2.5"

RPM_NAME = "python310-coverage-7.2.5-1.3.aarch64.rpm"
RPM_HASH = "c351324d08123879fa71b79f4c8fc482c4c50cddf3c46e1f18539870575ae8ea5f55d2820e0085f5268e53e5c27f8614ca8ec44ae60b29e2fb09491d160f327c"

RPROVIDES:${PN} += "python3.10dist-coverage \
python310-coverage \
python3dist-coverage"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310 \
update-alternatives"

inherit rpm
