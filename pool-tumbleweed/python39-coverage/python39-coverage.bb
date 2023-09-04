SUMMARY = "Code coverage measurement for Python"
DESCRIPTION = "Coverage.py measures code coverage, typically during test execution. It uses \
the code analysis tools and tracing hooks provided in the Python standard \
library to determine which lines are executable, and which have been executed."
LICENSE = "Apache-2.0"

PV = "7.3.0"

RPM_NAME = "python39-coverage-7.3.0-1.1.aarch64.rpm"
RPM_HASH = "abf830f38dd0a4f84c82da01df0f166b05ff1e5db04b165a5f9c161a5e80f9f477b0ec1c1041331064b8647c3d6f7a60623eb9c11e0edee0eb8edb5987972d98"

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
