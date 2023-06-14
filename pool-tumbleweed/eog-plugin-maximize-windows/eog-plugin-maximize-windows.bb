SUMMARY = "Eog maximize-windows plugin"
DESCRIPTION = "The Eye of Gnome Maximize Windows plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "eog-plugin-maximize-windows-44.0-1.1.aarch64.rpm"
RPM_HASH = "483cd8261a709c00558c1f2f5f901c4a3a2d8b43a91234cf2e80597f9f20681f39251593e5c3a681818e4e953e3dc601e4032102942fba27aff244e101bd610f"

RPROVIDES:${PN} += "eog-plugin-maximize-windows \
eog-plugins-/usr/lib64/eog/plugins/maximize-windows.plugin"

RDEPENDS:${PN} += "eog-plugins-data \
typelib-Eog \
typelib-GObject"

inherit rpm
