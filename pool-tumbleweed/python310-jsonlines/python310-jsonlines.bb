SUMMARY = "Library with helpers for the jsonlines file format"
DESCRIPTION = "Python library to simplify working with jsonlines_ and ndjson_ data."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python310-jsonlines-3.1.0-1.3.noarch.rpm"
RPM_HASH = "9de67f04c86b3b90fe01b52918d4ff115d6a44bd4873250e0dcc11d7f571ee41e12e385e0c862a41071c24b44c0d2e2233d745e578db3354a6ea1000dc4afc4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonlines \
python3.10dist-jsonlines \
python310-jsonlines \
python3dist-jsonlines"

RDEPENDS:${PN} += "python-abi"

inherit rpm
