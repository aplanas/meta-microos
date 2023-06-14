SUMMARY = "Nautilus overlay icons"
DESCRIPTION = "This package provides overlay icons to visualise the \
synchronisation state in the Nautilus file manager."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.8.2"

RPM_NAME = "nautilus-extension-nextcloud-3.8.2-1.1.noarch.rpm"
RPM_HASH = "a1edbf26de6292c2e70c87778dfa7f8e01c393ade4ab33b1e5c1ba747b627fada7ad09bcc5262a7c197f4f7d66f6d59c924b733e8d79f460d4ef772191119b6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nautilus-extension-nextcloud"

RDEPENDS:${PN} += "nautilus \
nextcloud-desktop \
python3-nautilus \
typelib-GObject \
typelib-Nautilus"

inherit rpm
