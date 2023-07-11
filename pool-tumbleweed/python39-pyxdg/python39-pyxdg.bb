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

RPM_NAME = "python39-pyxdg-0.28-2.3.noarch.rpm"
RPM_HASH = "0c7c6880df03dabed12feeee41528c05f4073c8b1bca4192cefaf7cca78c6431e2c88cd00fe6b2dadb57984ff3f3d1ba192fdf754353b3d1302b6fea04bd1e85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyxdg \
python39-pyxdg \
python3dist-pyxdg"

RDEPENDS:${PN} += "hicolor-icon-theme \
python-abi \
shared-mime-info"

inherit rpm
