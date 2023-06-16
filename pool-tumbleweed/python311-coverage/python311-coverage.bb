SUMMARY = "Code coverage measurement for Python"
DESCRIPTION = "Coverage.py measures code coverage, typically during test execution. It uses \
the code analysis tools and tracing hooks provided in the Python standard \
library to determine which lines are executable, and which have been executed."
LICENSE = "Apache-2.0"

PV = "7.2.5"

RPM_NAME = "python311-coverage-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "73f146fb080cd14398b45e4dbad3d46a6c90192edf61478eaf7734495092e42372beac0f32633ff3e63ccb2fe34595ae73fb3077370d74bba95d8081e7ad5937"

RPROVIDES:${PN} += "python3.11dist-coverage \
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
