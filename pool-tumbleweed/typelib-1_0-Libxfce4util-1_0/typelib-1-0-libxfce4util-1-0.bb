SUMMARY = "Utility Library for the Xfce Desktop Environment"
DESCRIPTION = "libxfce4util is a general-purpose utility library with core application support \
for the Xfce Desktop Environment."
LICENSE = "LGPL-2.1-or-later"

PV = "4.18.1"

RPM_NAME = "typelib-1_0-Libxfce4util-1_0-4.18.1-1.3.aarch64.rpm"
RPM_HASH = "eb8cfc82ff80a431d58365ddaf8837e31b5f517b6655139971c3c85cd7267a2340e94d707ec8f524d44f17eebe400fba1ef28b6c8fc6853d8dc94a0cbaf65b2c"

RPROVIDES:${PN} += "typelib-1-0-Libxfce4util-1-0 \
typelib-1-0-libxfce4util-1-0 \
typelib-Libxfce4util"

RDEPENDS:${PN} += "libxfce4util.so.7 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
