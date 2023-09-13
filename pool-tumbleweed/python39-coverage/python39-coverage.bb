SUMMARY = "Code coverage measurement for Python"
DESCRIPTION = "Coverage.py measures code coverage, typically during test execution. It uses \
the code analysis tools and tracing hooks provided in the Python standard \
library to determine which lines are executable, and which have been executed."
LICENSE = "Apache-2.0"

PV = "7.3.0"

RPM_NAME = "python39-coverage-7.3.0-2.1.aarch64.rpm"
RPM_HASH = "92cd9e3a14eb6e338e246dfa9c443c3c311899ea583eb9d8fa1080ff246ca34dcb2e5ea8f02c2b6cd622f32f180e9c9956e7269a16ab05641b16101df61753a3"

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
