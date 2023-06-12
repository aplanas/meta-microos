SUMMARY = "A Python library to convert from human-readable values to Python values"
DESCRIPTION = "humanreadable is a Python library to convert from human-readable \
values to Python values."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python39-humanreadable-0.1.0-1.12.noarch.rpm"
RPM_HASH = "2971c87000c2c237682a70b6f7b2aa236f9e017924a7e9a95aadc1e2ee089d75b9c2908301057965f5da15ac8b0fbc94494f01ac11c39197d44e173828320729"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(humanreadable) \
python39-humanreadable \
python3dist(humanreadable)"
RDEPENDS:${PN} += "python(abi) \
python39-setuptools \
python39-typepy"

inherit rpm
