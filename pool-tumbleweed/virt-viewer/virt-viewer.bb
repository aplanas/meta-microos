SUMMARY = "Virtual Machine Viewer"
DESCRIPTION = "Virtual Machine Viewer provides a graphical console client for \
connecting to virtual machines. It uses the GTK-VNC widget to provide \
the display, and libvirt for looking up VNC server details."
LICENSE = "GPL-2.0-or-later"

PV = "11.0"

RPM_NAME = "virt-viewer-11.0-4.4.aarch64.rpm"
RPM_HASH = "12f1545efc714ecf4556af323261bdda2016c0b9a5e13b5115f8413a8bd9955d7416d687bc43a1dc62c0f8c97d566719f4c098830c80e54d9a2297281715d808"

RPROVIDES:${PN} += "virt-viewer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-vnc-2.0.so.0 \
libgvnc-1.0.so.0 \
libpango-1.0.so.0 \
libspice-client-glib-2.0.so.8 \
libspice-client-gtk-3.0.so.5 \
libvirt-glib-1.0.so.0 \
libvirt.so.0 \
libvte-2.91.so.0 \
libxml2.so.2 \
netcat"

inherit rpm
