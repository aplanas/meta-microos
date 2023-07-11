SUMMARY = "Library with helpers for the jsonlines file format"
DESCRIPTION = "Python library to simplify working with jsonlines_ and ndjson_ data."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python39-jsonlines-3.1.0-2.1.noarch.rpm"
RPM_HASH = "94c8682335da7dd25e0e9feff9fd25b8d578def93837c18681e053d2c79c1ac1ff19faa3b1a465c7dcc3f5d92b0c7927a7f78693c5b08fe6d788834914eaab26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jsonlines \
python39-jsonlines \
python3dist-jsonlines"

RDEPENDS:${PN} += "python-abi"

inherit rpm
