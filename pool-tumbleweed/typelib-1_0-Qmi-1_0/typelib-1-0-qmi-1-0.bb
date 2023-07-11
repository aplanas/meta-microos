SUMMARY = "Introspection bindings for libqmi"
DESCRIPTION = "libqmi is a glib-based library for talking to WWAN modems and devices \
which speak the Qualcomm MSM Interface (QMI) protocol. \
 \
This package contains the introspection bindings for libqmi."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "1.32.4"

RPM_NAME = "typelib-1_0-Qmi-1_0-1.32.4-1.2.aarch64.rpm"
RPM_HASH = "af805cd8d6916b8f0c6e84bba6f499f496b3dea65d18a4c485767a66ef340ce1e1d460027b193dcef621e676fafe16bfaa6ede8a0b97dae3f286a13921349c60"

RPROVIDES:${PN} += "typelib-1-0-Qmi-1-0 \
typelib-Qmi"

RDEPENDS:${PN} += "libqmi-glib.so.5 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Qrtr"

inherit rpm
