SUMMARY = "Implementations of freedesktop.org standards in python"
DESCRIPTION = "PyXDG is a python library to access freedesktop.org standards. Currently supported are: \
 * Base Directory Specification Version 0.6 \
 * Menu Specification Version 1.0 \
 * Desktop Entry Specification Version 1.0 \
 * Icon Theme Specification Version 0.8 \
 * Recent File Spec 0.2 \
 * Shared-MIME-Database Specification 0.13"
LICENSE = "LGPL-2.1-only"

PV = "0.28"

RPM_NAME = "python311-pyxdg-0.28-2.1.noarch.rpm"
RPM_HASH = "64b013e8acd1f7db4f5c67cda2f36522aeee5ecc4582e6bf981fe3d57b3eae9fa15b12a90cc76b25b9d3b51bd9b930f072c4fdda67d429994a63267003b5aefd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pyxdg \
python311-pyxdg \
python3dist-pyxdg"

RDEPENDS:${PN} += "hicolor-icon-theme \
python-abi \
shared-mime-info"

inherit rpm
