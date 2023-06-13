SUMMARY = "Virtual Machine Viewer"
DESCRIPTION = "Virtual Machine Viewer provides a graphical console client for \
connecting to virtual machines. It uses the GTK-VNC widget to provide \
the display, and libvirt for looking up VNC server details."
LICENSE = "GPL-2.0-or-later"

PV = "11.0"

RPM_NAME = "virt-viewer-11.0-4.4.aarch64.rpm"
RPM_HASH = "12f1545efc714ecf4556af323261bdda2016c0b9a5e13b5115f8413a8bd9955d7416d687bc43a1dc62c0f8c97d566719f4c098830c80e54d9a2297281715d808"

RPROVIDES:${PN} += "application() \
application(remote-viewer.desktop) \
metainfo() \
metainfo(remote-viewer.appdata.xml) \
mimehandler(application/x-virt-viewer) \
mimehandler(x-scheme-handler/spice) \
mimehandler(x-scheme-handler/spice+tls) \
mimehandler(x-scheme-handler/spice+unix) \
virt-viewer \
virt-viewer(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtk-vnc-2.0.so.0()(64bit) \
libgvnc-1.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libspice-client-glib-2.0.so.8()(64bit) \
libspice-client-glib-2.0.so.8(SPICEGTK_1)(64bit) \
libspice-client-gtk-3.0.so.5()(64bit) \
libspice-client-gtk-3.0.so.5(SPICEGTK_1)(64bit) \
libvirt-glib-1.0.so.0()(64bit) \
libvirt-glib-1.0.so.0(LIBVIRT_GLIB_0.0.7)(64bit) \
libvirt.so.0()(64bit) \
libvirt.so.0(LIBVIRT_0.0.3)(64bit) \
libvirt.so.0(LIBVIRT_0.0.5)(64bit) \
libvirt.so.0(LIBVIRT_0.1.0)(64bit) \
libvirt.so.0(LIBVIRT_0.1.1)(64bit) \
libvirt.so.0(LIBVIRT_0.10.0)(64bit) \
libvirt.so.0(LIBVIRT_0.3.0)(64bit) \
libvirt.so.0(LIBVIRT_0.4.0)(64bit) \
libvirt.so.0(LIBVIRT_0.6.0)(64bit) \
libvirt.so.0(LIBVIRT_0.8.0)(64bit) \
libvirt.so.0(LIBVIRT_0.9.10)(64bit) \
libvirt.so.0(LIBVIRT_0.9.13)(64bit) \
libvirt.so.0(LIBVIRT_0.9.2)(64bit) \
libvirt.so.0(LIBVIRT_0.9.7)(64bit) \
libvirt.so.0(LIBVIRT_0.9.8)(64bit) \
libvirt.so.0(LIBVIRT_1.2.8)(64bit) \
libvte-2.91.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
netcat"

inherit rpm
