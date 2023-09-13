SUMMARY = "Nautilus overlay icons"
DESCRIPTION = "This package provides overlay icons to visualise the \
synchronisation state in the Nautilus file manager."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.9.3"

RPM_NAME = "nautilus-extension-nextcloud-3.9.3-1.1.noarch.rpm"
RPM_HASH = "06cf50253c2d1026b46c027567c70d1fde8b5d69240363afab4d9f143468db90fa5e08cc73c482a4ca8dfb42c9508ecf4ebb598cff04c0d561570e2fce00d64b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nautilus-extension-nextcloud"

RDEPENDS:${PN} += "nautilus \
nextcloud-desktop \
python3-nautilus \
typelib-GObject \
typelib-Nautilus"

inherit rpm
