SUMMARY = "Extended refactoring capabilities for Python LSP Server using Rope"
DESCRIPTION = "Extended refactoring capabilities for Python LSP Server using Rope. \
 \
This is a plugin for Python LSP Server."
LICENSE = "MIT"

PV = "0.1.11"

RPM_NAME = "python39-pylsp-rope-0.1.11-1.6.noarch.rpm"
RPM_HASH = "4fdb5ecc39296fe3ed486a39773737949954320818bf158c655e15d0cc71d76b6e54f4a04db148a5a90c743bd12f30af877e0695c9e10d5b04648c5f87b86a54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pylsp-rope \
python39-pylsp-rope \
python3dist-pylsp-rope"

RDEPENDS:${PN} += "python-abi \
python39-python-lsp-server \
python39-rope"

inherit rpm
