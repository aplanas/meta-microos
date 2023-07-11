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

RPM_NAME = "python311-pyxdg-0.28-2.3.noarch.rpm"
RPM_HASH = "a00d05ce476fccba37d0516a7d38c86da413495b0f2cea8a7d71aa366cb327efca294598f2290a6758db4c3b76ddffc2eb53cc3780c8125fb9bec8a42816eee7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyxdg \
python3.11dist-pyxdg \
python311-pyxdg \
python3dist-pyxdg"

RDEPENDS:${PN} += "hicolor-icon-theme \
python-abi \
shared-mime-info"

inherit rpm
