SUMMARY = "McCabe checker, plugin for flake8"
DESCRIPTION = "Ned's script to check McCabe complexity. \
This module provides a plugin for flake8, the Python code checker."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python39-mccabe-0.7.0-2.3.noarch.rpm"
RPM_HASH = "9460a59b6094533862f709815b6bdafabe01ed9838dab6d3247aa276175f1eb63382041e52a671575880c4545e350c98e56e7f29ff2e7ebe741c0094878e54b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mccabe \
python39-mccabe \
python3dist-mccabe"

RDEPENDS:${PN} += "python-abi"

inherit rpm
