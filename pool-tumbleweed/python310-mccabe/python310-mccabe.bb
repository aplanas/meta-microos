SUMMARY = "McCabe checker, plugin for flake8"
DESCRIPTION = "Ned's script to check McCabe complexity. \
This module provides a plugin for flake8, the Python code checker."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python310-mccabe-0.7.0-2.1.noarch.rpm"
RPM_HASH = "799b3ac439d2fe36454469a6ef4de5678f6fd4ef9c2dab372d0dc13ff8f6dc3f10b0fa92d3e0ce68b67ed0af1d6447e048e2548fd9bac19bda5d71b64f17961e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mccabe \
python3.10dist-mccabe \
python310-mccabe \
python3dist-mccabe"

RDEPENDS:${PN} += "python-abi"

inherit rpm
