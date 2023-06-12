SUMMARY = "Obex DBus API"
DESCRIPTION = "Obex-Data-Server provides a obex dbus api. Used for bluetooth \
applications to transfer and receive data."
LICENSE = "GPL-2.0+"

PV = "0.4.6"

RPM_NAME = "obex-data-server-0.4.6-15.30.aarch64.rpm"
RPM_HASH = "82bf2476a4912eac01e53d4bea11251c85d23a4dc13f8c42db809f4378b3963567da7a0b20cd1c3435be0b27755bea77376127391902c168f21769fa94aca95e"

RPROVIDES:${PN} += "config(obex-data-server) \
obex-data-server \
obex-data-server(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbluetooth.so.3()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgthread-2.0.so.0()(64bit) \
libopenobex.so.2()(64bit) \
libusb-0.1.so.4()(64bit)"

inherit rpm
