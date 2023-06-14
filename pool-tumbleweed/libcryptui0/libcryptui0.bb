SUMMARY = "Library for prompting for PGP keys"
DESCRIPTION = "Libcryptui is a library used for prompting for PGP keys."
LICENSE = "LGPL-2.1-or-later"

PV = "3.12.2"

RPM_NAME = "libcryptui0-3.12.2-10.3.aarch64.rpm"
RPM_HASH = "85f89aae88eac856c79960991ae9855d823888a7c27487c56eb168e357cd13a27e97bbf77fc32776cefff22636ac9424bb02c06871dcaf939e3c09bc9cdc2214"

RPROVIDES:${PN} += "libcryptui \
libcryptui.so.0 \
libcryptui0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnome-keyring \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcryptui-data \
libdbus-glib-1.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
