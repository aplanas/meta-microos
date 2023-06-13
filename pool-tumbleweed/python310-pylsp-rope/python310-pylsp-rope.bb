SUMMARY = "Extended refactoring capabilities for Python LSP Server using Rope"
DESCRIPTION = "Extended refactoring capabilities for Python LSP Server using Rope. \
 \
This is a plugin for Python LSP Server."
LICENSE = "MIT"

PV = "0.1.11"

RPM_NAME = "python310-pylsp-rope-0.1.11-1.4.noarch.rpm"
RPM_HASH = "d085bbc5f687cc34fbf091f08f4c82e42b57c7a394bab8f6f807457425c300ac7d483a7d5bcfaf25a72f0ba4ca0f62cd0de1dfe00938c7cec87083974d3f8a48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylsp-rope \
python3.10dist(pylsp-rope) \
python310-pylsp-rope \
python3dist(pylsp-rope)"

RDEPENDS:${PN} += "python(abi) \
python310-python-lsp-server \
python310-rope"

inherit rpm
