SUMMARY = "Shared object for GTK2 hosts displaying Qt5 LV2 GUIs"
DESCRIPTION = "Module plugin for: \
* GTK2 hosts displaying Qt5 LV2 GUIs using suil"
LICENSE = "ISC"

PV = "0.10.18"

RPM_NAME = "suil-plugin-gtk2-in-qt5-0.10.18-1.1.aarch64.rpm"
RPM_HASH = "52971745c5cb5515a8994b872def3b8158e6c0e41e49ee486a41a0710068d49a8f7c71fc08169caf900822bef59ec5ce63c668f7bf9dd0a49677bfda42f8367a"

RPROVIDES:${PN} += "libsuil-gtk2-in-qt5.so \
suil-plugin-gtk2-in-qt5"

RDEPENDS:${PN} += "gtk2-tools \
ld-linux-aarch64.so.1 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libstdc++.so.6 \
libsuil-0-0"

inherit rpm
