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

RPM_NAME = "python39-pyxdg-0.28-2.1.noarch.rpm"
RPM_HASH = "bb1465b6055affc8c50cfc7436886aae1c91b51d18d1e78c84272eb81dc10f720edb65898e4ebbcfcd9794ea3be85755a73fa033eb304b73d2078a49e92b3ab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyxdg \
python39-pyxdg \
python3dist-pyxdg"

RDEPENDS:${PN} += "hicolor-icon-theme \
python-abi \
shared-mime-info"

inherit rpm
