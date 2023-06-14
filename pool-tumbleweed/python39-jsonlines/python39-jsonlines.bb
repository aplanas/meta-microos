SUMMARY = "Library with helpers for the jsonlines file format"
DESCRIPTION = "Python library to simplify working with jsonlines_ and ndjson_ data."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python39-jsonlines-3.1.0-1.3.noarch.rpm"
RPM_HASH = "8821cb675e22da7b0faf2ceabfe448b820de5cdb43927feef1912d3aff588e6ab46bb2b1da45a77e85a78399e70db69496ee5cfed86b6ee0b572a8c4f0515d1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jsonlines \
python39-jsonlines \
python3dist-jsonlines"

RDEPENDS:${PN} += "python-abi"

inherit rpm
