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

RPM_NAME = "python310-pyxdg-0.28-2.1.noarch.rpm"
RPM_HASH = "982d93d45f16547a78d66de9f4f9a0c76741939dc9fd9e119eaf3d0caf006fce136a194070f791611f1e76130a6f1e990be3bcad1be961febc76425b30af107a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyxdg \
python3.10dist-pyxdg \
python310-pyxdg \
python3dist-pyxdg"

RDEPENDS:${PN} += "hicolor-icon-theme \
python-abi \
shared-mime-info"

inherit rpm
