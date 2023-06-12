SUMMARY = "Caja overlay icons"
DESCRIPTION = "This package provides overlay icons to visualise the \
synchronisation state in the Caja file manager."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.8.2"

RPM_NAME = "caja-extension-nextcloud-3.8.2-1.1.noarch.rpm"
RPM_HASH = "25ccb5f8501ef3cabda248b2bec8e4eab83e6093f2a60dcdab1452012a2b8fec46bb597161a9a0a769d2bf1be211e40799315699a8e4f69c6581c6e96294e53b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-extension-nextcloud"
RDEPENDS:${PN} += "caja nextcloud-desktop python-caja typelib(Caja) typelib(GObject)"

inherit rpm
