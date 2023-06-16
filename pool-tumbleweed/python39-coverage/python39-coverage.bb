SUMMARY = "Code coverage measurement for Python"
DESCRIPTION = "Coverage.py measures code coverage, typically during test execution. It uses \
the code analysis tools and tracing hooks provided in the Python standard \
library to determine which lines are executable, and which have been executed."
LICENSE = "Apache-2.0"

PV = "7.2.5"

RPM_NAME = "python39-coverage-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "fcd7a6b7dd8144f4296180036fb60fa20674a66a75cc2c34374ffdeda9c9a74a19687ff1ed7eeda622b4bff90f27cf3a60da318969ec02bc8c1d95cc353cfbc9"

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
