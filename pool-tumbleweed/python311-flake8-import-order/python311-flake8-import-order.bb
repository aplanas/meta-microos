SUMMARY = "Flake8 plugin that checks the ordering of import statements"
DESCRIPTION = "Flake8 and pylama plugin that checks the ordering of import statements."
LICENSE = "LGPL-3.0-only"

PV = "0.18.2"

RPM_NAME = "python311-flake8-import-order-0.18.2-1.6.noarch.rpm"
RPM_HASH = "eaedc4c59af0dcc0f806f486fae81493fe7a162a55cf6ac768787f309d40ffb378ac6ec4a163b16361162e83afe36c2ea9f143dec255401b634fc9a33fb1574f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-import-order \
python3.11dist-flake8-import-order \
python311-flake8-import-order \
python3dist-flake8-import-order"

RDEPENDS:${PN} += "python-abi \
python311-flake8 \
python311-pycodestyle"

inherit rpm
