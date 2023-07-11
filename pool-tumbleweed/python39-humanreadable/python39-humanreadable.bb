SUMMARY = "A Python library to convert from human-readable values to Python values"
DESCRIPTION = "humanreadable is a Python library to convert from human-readable \
values to Python values."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python39-humanreadable-0.1.0-1.14.noarch.rpm"
RPM_HASH = "f22f714a2c26b2b7655163b852de3c1f4d3a0bcea376beafc59c9a3e88113a1e420b1a9e2096bd4cc1850b1f7d72c5b0370c22d1195514f26d1f2a176e00d01d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-humanreadable \
python39-humanreadable \
python3dist-humanreadable"

RDEPENDS:${PN} += "python-abi \
python39-setuptools \
python39-typepy"

inherit rpm
