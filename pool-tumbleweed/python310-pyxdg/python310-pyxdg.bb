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

RPM_NAME = "python310-pyxdg-0.28-2.3.noarch.rpm"
RPM_HASH = "3fa7c955004819f44c305908be0b29279a00125f9c241d89a007595c633850cff88fe00b4f8329def20c6b41f5e04a3447ee0f8386b913009f5aa6e2671f0e03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyxdg \
python310-pyxdg \
python3dist-pyxdg"

RDEPENDS:${PN} += "hicolor-icon-theme \
python-abi \
shared-mime-info"

inherit rpm
