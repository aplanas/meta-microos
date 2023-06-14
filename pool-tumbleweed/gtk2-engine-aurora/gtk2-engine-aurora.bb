SUMMARY = "Another GTK2 engine theme"
DESCRIPTION = "The Aurora Gtk Engine themes all common Gtk widgets \
to provide an attractive, complete and consistent \
look for Gtk applications."
LICENSE = "GPL-2.0"

PV = "1.5.1"

RPM_NAME = "gtk2-engine-aurora-1.5.1-16.29.aarch64.rpm"
RPM_HASH = "eb3b64c55670adaa10bf7e08bf932b63351a914209a0e808dc733254acf9639e7399dbe3dc0e797bca1e70a4ce136bb0d1aec660069ff4446218acacc60d67f0"

RPROVIDES:${PN} += "gtk2-engine-aurora \
libaurora.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
