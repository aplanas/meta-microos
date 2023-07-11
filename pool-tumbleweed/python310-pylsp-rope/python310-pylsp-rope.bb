SUMMARY = "Extended refactoring capabilities for Python LSP Server using Rope"
DESCRIPTION = "Extended refactoring capabilities for Python LSP Server using Rope. \
 \
This is a plugin for Python LSP Server."
LICENSE = "MIT"

PV = "0.1.11"

RPM_NAME = "python310-pylsp-rope-0.1.11-1.6.noarch.rpm"
RPM_HASH = "fb7e9694a871a2a0b8c81027c90e613689f7bfb6158b1b638419cfeb7db88627db8d7a1d62995362e85b5251e657a9784ae202827c980411685d320729b3a935"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pylsp-rope \
python310-pylsp-rope \
python3dist-pylsp-rope"

RDEPENDS:${PN} += "python-abi \
python310-python-lsp-server \
python310-rope"

inherit rpm
