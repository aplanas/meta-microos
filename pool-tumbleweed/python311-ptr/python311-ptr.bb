SUMMARY = "Parallel asyncio Python setup(cfg|py) test runner"
DESCRIPTION = "Parallel asyncio Python setup.(cfg|py) test runner."
LICENSE = "MIT"

PV = "20.2.26"

RPM_NAME = "python311-ptr-20.2.26-3.12.noarch.rpm"
RPM_HASH = "e5da91bcf516cf60a535b132d4217e3f19306cee722cb5172af8b6882045462009561c5a742ec72cd3765183ecab38fc633d2f58db1790466fde7b5da2b68ac9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ptr \
python311-ptr \
python3dist-ptr"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
