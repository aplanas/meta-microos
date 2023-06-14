SUMMARY = "A podcast client for the desktop"
DESCRIPTION = "A podcast application designed for Elementary OS and other GTK-based \
Linux desktops. Includes a built-in video player, automatic updating, \
smart library management, library importing and exporting, custom \
skip intervals, and more."
LICENSE = "GPL-3.0-only"

PV = "2.4.2"

RPM_NAME = "vocal-2.4.2-5.4.aarch64.rpm"
RPM_HASH = "d88a74cc63ed264dc60648055a6de4eecd5ee256578f7b56db25ea09fc52531aa3ee59b4ffe7571cc0a60babd89b50b971b013b6d3252ed9e2bdd4a182973e2f"

RPROVIDES:${PN} += "vocal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libclutter-1.0.so.0 \
libclutter-gst-3.0.so.0 \
libclutter-gtk-1.0.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libnotify.so.4 \
libsoup-2.4.so.1 \
libsqlite3.so.0 \
libxml2.so.2"

inherit rpm
