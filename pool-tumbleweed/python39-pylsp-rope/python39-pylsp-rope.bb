SUMMARY = "Extended refactoring capabilities for Python LSP Server using Rope"
DESCRIPTION = "Extended refactoring capabilities for Python LSP Server using Rope. \
 \
This is a plugin for Python LSP Server."
LICENSE = "MIT"

PV = "0.1.11"

RPM_NAME = "python39-pylsp-rope-0.1.11-1.4.noarch.rpm"
RPM_HASH = "0f1c2bc195f7a619b2ae7a2c6499cc34fea160d82ec05f4cfdfa11bb903b78eaa1904eacb3cf4bf28b8dfb5eeb2d3e83fb3024145c00009708a063bff65a715a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pylsp-rope) \
python39-pylsp-rope \
python3dist(pylsp-rope)"
RDEPENDS:${PN} += "python(abi) \
python39-python-lsp-server \
python39-rope"

inherit rpm
