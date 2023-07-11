SUMMARY = "Extended refactoring capabilities for Python LSP Server using Rope"
DESCRIPTION = "Extended refactoring capabilities for Python LSP Server using Rope. \
 \
This is a plugin for Python LSP Server."
LICENSE = "MIT"

PV = "0.1.11"

RPM_NAME = "python311-pylsp-rope-0.1.11-1.6.noarch.rpm"
RPM_HASH = "950e4b99db0b8d71542ef41e46f5a3cbaf3c2177ce5eb98d1f20d2e25a528fbfe308fa71becbe2a2047a9d82019000799b5064177881150374af7240d2a8d1bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylsp-rope \
python3.11dist-pylsp-rope \
python311-pylsp-rope \
python3dist-pylsp-rope"

RDEPENDS:${PN} += "python-abi \
python311-python-lsp-server \
python311-rope"

inherit rpm
