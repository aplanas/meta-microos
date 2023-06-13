SUMMARY = "Introspection bindings for the Qualcomm IPC Router protocol helper library"
DESCRIPTION = "This package provides the introspection bindings for the Qualcomm IPC Router protocol helper library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.2"

RPM_NAME = "typelib-1_0-Qrtr-1_0-1.2.2-1.4.aarch64.rpm"
RPM_HASH = "475e506fde54eb81bdcca6c7fc37275af9bea88327ee45e5f0797cc069456fb0ca1eb6a8d57c9550ab546543f0d1ea25e23ccda3fd778dcf64282ea078147ea1"

RPROVIDES:${PN} += "typelib(Qrtr) \
typelib-1_0-Qrtr-1_0 \
typelib-1_0-Qrtr-1_0(aarch-64)"

RDEPENDS:${PN} += "libqrtr-glib.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
