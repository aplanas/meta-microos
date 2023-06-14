SUMMARY = "McCabe checker, plugin for flake8"
DESCRIPTION = "Ned's script to check McCabe complexity. \
This module provides a plugin for flake8, the Python code checker."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python39-mccabe-0.7.0-2.1.noarch.rpm"
RPM_HASH = "60ab1b5a987b3c5c843375dc377a45de34218a08b8872bc3d70d344992aa072895fd10f6a34f8d042d6ec3e25cc1efed02aa37608a5a33619bfbd20d7e54f128"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mccabe \
python39-mccabe \
python3dist-mccabe"

RDEPENDS:${PN} += "python-abi"

inherit rpm
