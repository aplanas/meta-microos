SUMMARY = "Eog maximize-windows plugin"
DESCRIPTION = "The Eye of Gnome Maximize Windows plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "eog-plugin-maximize-windows-44.0-1.2.aarch64.rpm"
RPM_HASH = "200840147c7b23e7c5b94180a70401aabd1b8308e35deb43e734a932bc1eeab1460f9b6aa43500e962d926b75a3cbe12813904fa258edb34a86d0d82f21c404e"

RPROVIDES:${PN} += "eog-plugin-maximize-windows \
eog-plugins-/usr/lib64/eog/plugins/maximize-windows.plugin"

RDEPENDS:${PN} += "eog-plugins-data \
typelib-Eog \
typelib-GObject"

inherit rpm
