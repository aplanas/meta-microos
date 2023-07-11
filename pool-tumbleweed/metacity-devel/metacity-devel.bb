SUMMARY = "Header files for the MATE Desktop Window Manager"
DESCRIPTION = "Metacity is a window manager using GTK to do everything. \
It is developed mainly for the MATE and GNOME Flashback desktops. \
 \
This package contains all necessary include files and libraries \
needed to develop applications that require libmetacity."
LICENSE = "GPL-2.0-or-later"

PV = "3.46.1"

RPM_NAME = "metacity-devel-3.46.1-1.2.aarch64.rpm"
RPM_HASH = "53937f04f42e0f61bd99e3ac63c8ca13178ae744e8eb529f407b4327ca7b82a666205ce4f29a7f30770ed4b322b7df568168bff75ecb89e41cda957155ed9e87"

RPROVIDES:${PN} += "metacity-devel \
pkgconfig-libmetacity"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmetacity3 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0"

inherit rpm
