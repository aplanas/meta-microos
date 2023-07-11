SUMMARY = "An implementation of time.monotonic() for Python 2 & < 33"
DESCRIPTION = "This module provides a ``monotonic()`` function which returns the \
value (in fractional seconds) of a clock which never goes backwards."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "python39-monotonic-1.6-1.9.noarch.rpm"
RPM_HASH = "9517e8cc1f6cc524c998408d9774ea72d16a84e3e3b00aec4eb4efb029cbdae47cf33d7a3adea0157a9db716265390b551d2ac916d73899345ed5b4208d9f049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-monotonic \
python39-monotonic \
python3dist-monotonic"

RDEPENDS:${PN} += "python-abi"

inherit rpm
