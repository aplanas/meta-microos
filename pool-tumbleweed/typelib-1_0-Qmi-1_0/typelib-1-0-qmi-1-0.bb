SUMMARY = "Introspection bindings for libqmi"
DESCRIPTION = "libqmi is a glib-based library for talking to WWAN modems and devices \
which speak the Qualcomm MSM Interface (QMI) protocol. \
 \
This package contains the introspection bindings for libqmi."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "1.32.4"

RPM_NAME = "typelib-1_0-Qmi-1_0-1.32.4-1.1.aarch64.rpm"
RPM_HASH = "892808a0bc3a6b7bbf1610594cee3a566541694935c82eefe81d9d5b68ce5d362fd615ed96ead4a2b66802be35f8f0c84c57519d789864e6210d813c06660738"

RPROVIDES:${PN} += "typelib(Qmi) \
typelib-1_0-Qmi-1_0 \
typelib-1_0-Qmi-1_0(aarch-64)"
RDEPENDS:${PN} += "libqmi-glib.so.5()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio) \
typelib(Qrtr)"

inherit rpm
