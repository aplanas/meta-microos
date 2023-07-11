SUMMARY = "Nautilus overlay icons"
DESCRIPTION = "This package provides overlay icons to visualise the \
synchronisation state in the Nautilus file manager."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.9.0"

RPM_NAME = "nautilus-extension-nextcloud-3.9.0-3.1.noarch.rpm"
RPM_HASH = "3a8a3329b36f353b66e196c8e617c54a176e599448fdd8fd26409b6ddcc0f400bc191ed01dfc602a5a06d5211775987e6713f611b5b527d864cc5c29c1b9a7f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nautilus-extension-nextcloud"

RDEPENDS:${PN} += "nautilus \
nextcloud-desktop \
python3-nautilus \
typelib-GObject \
typelib-Nautilus"

inherit rpm
