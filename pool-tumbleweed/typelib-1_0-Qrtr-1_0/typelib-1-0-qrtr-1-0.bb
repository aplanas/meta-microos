SUMMARY = "Introspection bindings for the Qualcomm IPC Router protocol helper library"
DESCRIPTION = "This package provides the introspection bindings for the Qualcomm IPC Router protocol helper library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.2"

RPM_NAME = "typelib-1_0-Qrtr-1_0-1.2.2-1.5.aarch64.rpm"
RPM_HASH = "8c20eac4584c5fc0c41466fabfd18ddb71d9eda3873223326c1dcf4491758bbf73d8626422bbce3e5c8d582ff0d4b15ea45c4ffaebd183adb0cf987d43e294e4"

RPROVIDES:${PN} += "typelib-1-0-Qrtr-1-0 \
typelib-Qrtr"

RDEPENDS:${PN} += "libqrtr-glib.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
