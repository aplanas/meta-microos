SUMMARY = "Obex DBus API"
DESCRIPTION = "Obex-Data-Server provides a obex dbus api. Used for bluetooth \
applications to transfer and receive data."
LICENSE = "GPL-2.0+"

PV = "0.4.6"

RPM_NAME = "obex-data-server-0.4.6-15.30.aarch64.rpm"
RPM_HASH = "82bf2476a4912eac01e53d4bea11251c85d23a4dc13f8c42db809f4378b3963567da7a0b20cd1c3435be0b27755bea77376127391902c168f21769fa94aca95e"

RPROVIDES:${PN} += "config-obex-data-server \
obex-data-server"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
libdbus-glib-1.so.2 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgthread-2.0.so.0 \
libopenobex.so.2 \
libusb-0.1.so.4"

inherit rpm
