SUMMARY = "Code coverage measurement for Python"
DESCRIPTION = "Coverage.py measures code coverage, typically during test execution. It uses \
the code analysis tools and tracing hooks provided in the Python standard \
library to determine which lines are executable, and which have been executed."
LICENSE = "Apache-2.0"

PV = "7.3.0"

RPM_NAME = "python310-coverage-7.3.0-2.1.aarch64.rpm"
RPM_HASH = "12f14f3e17c5f5826d8734c60f6307a0e6aba20a99d49bdb683c152af73a964eeaddd97b593d20b8b8a71d0ef4dc862a7c3e96d734ee1ff26d389bdd7dc6f49d"

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
