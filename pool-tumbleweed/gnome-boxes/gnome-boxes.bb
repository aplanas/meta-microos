SUMMARY = "A GNOME 3 application to access remote or virtual systems"
DESCRIPTION = "Boxes is an application to create, setup, access, and use: remote \
machines, remote and local virtual machines, and, when technology permits, \
applications on local virtual machines."
LICENSE = "LGPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-boxes-44.1-1.1.aarch64.rpm"
RPM_HASH = "662f3f3f34f354c3f85fcead5545c98438d12f3b65c0ccd5a1f1b917f91645a0605b15aa7d7f41dc63e08858612d757b0ba40b3299c9555ac9f1f7ecf40449cb"

RPROVIDES:${PN} += "gnome-boxes \
libgovf-0.1.so \
typelib-Govf"

RDEPENDS:${PN} += "fuseiso \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgudev-1.0.so.0 \
libhandy-1.so.0 \
libm.so.6 \
libosinfo-1.0.so.0 \
libsoup-3.0.so.0 \
libspice-client-glib-2.0.so.8 \
libspice-client-gtk-3.0.so.5 \
libusb-1.0.so.0 \
libvirt-daemon-qemu \
libvirt-gconfig-1.0.so.0 \
libvirt-gobject-1.0.so.0 \
libwebkit2gtk-4.1.so.0 \
libxml2.so.2 \
mtools \
tracker \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
