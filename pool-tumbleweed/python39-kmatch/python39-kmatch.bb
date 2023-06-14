SUMMARY = "A language for matching/validating/filtering Python dictionaries"
DESCRIPTION = "The kmatch library provides a language for matching Python \
dictionaries. Patterns are specified as lists of filters combined \
with logical operators."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-kmatch-0.4.0-2.3.noarch.rpm"
RPM_HASH = "2dceb211bef7b058a62a75f0712f39b66f2e831e92b4dd1923e38732078959ad68f4933c01a8a8e91d9a94006dc944873028ebd5d075fff50d17f9a1f4f2aee2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-kmatch \
python39-kmatch \
python3dist-kmatch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
