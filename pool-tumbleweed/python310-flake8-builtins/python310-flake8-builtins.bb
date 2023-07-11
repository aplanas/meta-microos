SUMMARY = "Flake8 Builtins plugin"
DESCRIPTION = "This plugin checks for Python builtins being used as variables or parameters."
LICENSE = "GPL-2.0-only"

PV = "2.1.0"

RPM_NAME = "python310-flake8-builtins-2.1.0-1.5.noarch.rpm"
RPM_HASH = "348c62a454e2f4c1baf80e1b80e47b280cb9797456471f6e60f96c87bd09846234a64552fa1563e0b6356a946c0335f90be953ccefd3b938425d4275d9ae45d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flake8-builtins \
python310-flake8-builtins \
python3dist-flake8-builtins"

RDEPENDS:${PN} += "python-abi \
python310-flake8"

inherit rpm
