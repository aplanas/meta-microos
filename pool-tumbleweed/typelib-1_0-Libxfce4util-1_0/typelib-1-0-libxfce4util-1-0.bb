SUMMARY = "Utility Library for the Xfce Desktop Environment"
DESCRIPTION = "libxfce4util is a general-purpose utility library with core application support \
for the Xfce Desktop Environment."
LICENSE = "LGPL-2.1-or-later"

PV = "4.18.1"

RPM_NAME = "typelib-1_0-Libxfce4util-1_0-4.18.1-1.4.aarch64.rpm"
RPM_HASH = "c7da81b92dea74ebde7f60469ce6d785b3ff8e5a060b5d47e3c2c611017a328d8e158b828d7107a9ff038ceb980a47998ff89968ef207d90d910cca41126458c"

RPROVIDES:${PN} += "typelib-1-0-Libxfce4util-1-0 \
typelib-1-0-libxfce4util-1-0 \
typelib-Libxfce4util"

RDEPENDS:${PN} += "libxfce4util.so.7 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
