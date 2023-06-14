SUMMARY = "Extended refactoring capabilities for Python LSP Server using Rope"
DESCRIPTION = "Extended refactoring capabilities for Python LSP Server using Rope. \
 \
This is a plugin for Python LSP Server."
LICENSE = "MIT"

PV = "0.1.11"

RPM_NAME = "python311-pylsp-rope-0.1.11-1.4.noarch.rpm"
RPM_HASH = "bb040ed9f5e06d09217d26555acbc5439e5279c6e76404b6e88675ca99c93741fef52e4bff9f24286baf65ae69c169b16e1df65ae7533602867ba069eeafb9ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pylsp-rope \
python311-pylsp-rope \
python3dist-pylsp-rope"

RDEPENDS:${PN} += "python-abi \
python311-python-lsp-server \
python311-rope"

inherit rpm
