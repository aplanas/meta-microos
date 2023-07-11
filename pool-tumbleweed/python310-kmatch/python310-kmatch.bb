SUMMARY = "A language for matching/validating/filtering Python dictionaries"
DESCRIPTION = "The kmatch library provides a language for matching Python \
dictionaries. Patterns are specified as lists of filters combined \
with logical operators."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-kmatch-0.4.0-2.5.noarch.rpm"
RPM_HASH = "01eab77b4274bec7ffa9651414e17349bba827409bee850db9fd9800d7989c6840fc413146975fd0c9d6a73c41e8f90e41d43c46a35df87598d37250f38d0c4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-kmatch \
python310-kmatch \
python3dist-kmatch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
