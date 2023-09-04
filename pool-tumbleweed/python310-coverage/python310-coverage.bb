SUMMARY = "Code coverage measurement for Python"
DESCRIPTION = "Coverage.py measures code coverage, typically during test execution. It uses \
the code analysis tools and tracing hooks provided in the Python standard \
library to determine which lines are executable, and which have been executed."
LICENSE = "Apache-2.0"

PV = "7.3.0"

RPM_NAME = "python310-coverage-7.3.0-1.1.aarch64.rpm"
RPM_HASH = "6e2d08774b4487a347861dedac55c917d17fe284d2f5c2b053422983db8c6591855010e8b3ad5599457c188dcead795ed186280d8a653b6ac2465c68dc36e488"

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
