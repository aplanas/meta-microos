SUMMARY = "A Python library to convert from human-readable values to Python values"
DESCRIPTION = "humanreadable is a Python library to convert from human-readable \
values to Python values."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python310-humanreadable-0.1.0-1.14.noarch.rpm"
RPM_HASH = "33d7b52696f0eafc198a26529211ca40e0a469b62cd1d6d34955b323f593630abcc083d4d969cdb6108c6f948454e84b880097e681c32d2b08fa888cc3c7a409"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-humanreadable \
python310-humanreadable \
python3dist-humanreadable"

RDEPENDS:${PN} += "python-abi \
python310-setuptools \
python310-typepy"

inherit rpm
