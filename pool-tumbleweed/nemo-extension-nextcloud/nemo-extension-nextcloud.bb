SUMMARY = "Nemo overlay icons"
DESCRIPTION = "This package provides overlay icons to visualise the \
synchronisation state in the Nemo file manager."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.9.3"

RPM_NAME = "nemo-extension-nextcloud-3.9.3-1.1.noarch.rpm"
RPM_HASH = "83375b33eccb4bfee450571d2521c7b6c6eeac6f40e054c04d53ac9e7eb2aa93584c68c375879ed281c21bd2d4d45d3e4c118d84ecdb28038668c47de0475638"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-extension-nextcloud"

RDEPENDS:${PN} += "nemo \
nextcloud-desktop \
python-nemo \
typelib-GObject \
typelib-Nemo"

inherit rpm
