SUMMARY = "A Python library to convert from human-readable values to Python values"
DESCRIPTION = "humanreadable is a Python library to convert from human-readable \
values to Python values."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python310-humanreadable-0.1.0-1.12.noarch.rpm"
RPM_HASH = "6d7f7e30a9ddd25c76dd63e0989c8efc0f2b1c1b899b3c763f94811268dfa6a5cb5b35ff3ce33d35266308929b796449408c75a9cf7a77017359e4baae13b86a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-humanreadable \
python3.10dist(humanreadable) \
python310-humanreadable \
python3dist(humanreadable)"

RDEPENDS:${PN} += "python(abi) \
python310-setuptools \
python310-typepy"

inherit rpm
