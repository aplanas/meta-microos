SUMMARY = "McCabe checker, plugin for flake8"
DESCRIPTION = "Ned's script to check McCabe complexity. \
This module provides a plugin for flake8, the Python code checker."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python311-mccabe-0.7.0-2.3.noarch.rpm"
RPM_HASH = "b47e95c958e6025b36e0685cad18310d5892ff610d7a14d7d36c4940e6b8e7c1dcff2d4ca6bfcbaaaa8313141e614091c54f0ea28d3128c75f1c46504d6eb4c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mccabe \
python3.11dist-mccabe \
python311-mccabe \
python3dist-mccabe"

RDEPENDS:${PN} += "python-abi"

inherit rpm
