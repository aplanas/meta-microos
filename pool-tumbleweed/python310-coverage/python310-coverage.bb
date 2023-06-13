SUMMARY = "Code coverage measurement for Python"
DESCRIPTION = "Coverage.py measures code coverage, typically during test execution. It uses \
the code analysis tools and tracing hooks provided in the Python standard \
library to determine which lines are executable, and which have been executed."
LICENSE = "Apache-2.0"

PV = "7.2.5"

RPM_NAME = "python310-coverage-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "b2e1f681912b24858feb65b30d0bfeacdb00af67ec4d870ec1d519448bd25bebc4347ee3b26dd558d8793585c96c837e1fa3f963cb2a49c4784ea65016f9ec59"

RPROVIDES:${PN} += "python3-coverage \
python3.10dist(coverage) \
python310-coverage \
python310-coverage(aarch-64) \
python3dist(coverage)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python310 \
update-alternatives"

inherit rpm
