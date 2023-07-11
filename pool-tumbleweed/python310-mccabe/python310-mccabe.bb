SUMMARY = "McCabe checker, plugin for flake8"
DESCRIPTION = "Ned's script to check McCabe complexity. \
This module provides a plugin for flake8, the Python code checker."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python310-mccabe-0.7.0-2.3.noarch.rpm"
RPM_HASH = "2e2328e2f00dbaa6c18577fb11ae81e08715a0a1b4a4820178f8a4774174922cc63ce363858ef652e59186e320e72f8c39e41022f7cee98e9e4f4dbe2f31e696"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mccabe \
python310-mccabe \
python3dist-mccabe"

RDEPENDS:${PN} += "python-abi"

inherit rpm
