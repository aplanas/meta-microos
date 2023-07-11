SUMMARY = "A Python library to convert from human-readable values to Python values"
DESCRIPTION = "humanreadable is a Python library to convert from human-readable \
values to Python values."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python311-humanreadable-0.1.0-1.14.noarch.rpm"
RPM_HASH = "e1fc056b453adf1827c56f4a7acdb6d7aaa93f5659dbb78ab1e58f060958e690951a8c1d026a991ec3f80387930c92b87a0cf3b339a9f07b3293321e7c820708"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-humanreadable \
python3.11dist-humanreadable \
python311-humanreadable \
python3dist-humanreadable"

RDEPENDS:${PN} += "python-abi \
python311-setuptools \
python311-typepy"

inherit rpm
