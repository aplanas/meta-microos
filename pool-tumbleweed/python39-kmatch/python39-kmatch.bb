SUMMARY = "A language for matching/validating/filtering Python dictionaries"
DESCRIPTION = "The kmatch library provides a language for matching Python \
dictionaries. Patterns are specified as lists of filters combined \
with logical operators."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-kmatch-0.4.0-2.5.noarch.rpm"
RPM_HASH = "b6edafdbec0b8d555d062cbb0ba3dbd3870a5bcfd8f47e2cace846de4cdac18b35cbf8732e9e86689a5198c5fcba9d5aaa147ae28eabcd6eedb12d8bf17ab5d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-kmatch \
python39-kmatch \
python3dist-kmatch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
