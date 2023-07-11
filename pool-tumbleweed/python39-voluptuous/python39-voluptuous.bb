SUMMARY = "A Python data validation library"
DESCRIPTION = "Voluptuous is a Python data validation library. It validates data \
coming into Python as JSON, YAML, etc."
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python39-voluptuous-0.13.1-1.5.noarch.rpm"
RPM_HASH = "e83bf5fdc211d6ba57c3488b0a3018c68779f784bca4ffd451e98eb4a6e541f79c907d068a1ea2eee5d960c85043c38595dda4a88e3b0cfe6b527db6b5add004"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-voluptuous \
python39-voluptuous \
python3dist-voluptuous"

RDEPENDS:${PN} += "python-abi"

inherit rpm
