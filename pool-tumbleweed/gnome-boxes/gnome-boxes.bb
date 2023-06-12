SUMMARY = "A GNOME 3 application to access remote or virtual systems"
DESCRIPTION = "Boxes is an application to create, setup, access, and use: remote \
machines, remote and local virtual machines, and, when technology permits, \
applications on local virtual machines."
LICENSE = "LGPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-boxes-44.1-1.1.aarch64.rpm"
RPM_HASH = "662f3f3f34f354c3f85fcead5545c98438d12f3b65c0ccd5a1f1b917f91645a0605b15aa7d7f41dc63e08858612d757b0ba40b3299c9555ac9f1f7ecf40449cb"

RPROVIDES:${PN} += "application() \
application(org.gnome.Boxes.desktop) \
gnome-boxes \
gnome-boxes(aarch-64) \
libgovf-0.1.so()(64bit) \
metainfo() \
metainfo(org.gnome.Boxes.appdata.xml) \
mimehandler(application/x-cd-image) \
typelib(Govf)"
RDEPENDS:${PN} += "fuseiso \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libarchive.so.13()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
libhandy-1.so.0()(64bit) \
libhandy-1.so.0(LIBHANDY_1_0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libosinfo-1.0.so.0()(64bit) \
libosinfo-1.0.so.0(LIBOSINFO_0.0.1)(64bit) \
libosinfo-1.0.so.0(LIBOSINFO_0.0.5)(64bit) \
libosinfo-1.0.so.0(LIBOSINFO_0.2.0)(64bit) \
libosinfo-1.0.so.0(LIBOSINFO_0.2.1)(64bit) \
libosinfo-1.0.so.0(LIBOSINFO_0.2.10)(64bit) \
libosinfo-1.0.so.0(LIBOSINFO_0.2.11)(64bit) \
libosinfo-1.0.so.0(LIBOSINFO_0.2.12)(64bit) \
libosinfo-1.0.so.0(LIBOSINFO_0.2.2)(64bit) \
libosinfo-1.0.so.0(LIBOSINFO_0.2.3)(64bit) \
libosinfo-1.0.so.0(LIBOSINFO_0.2.6)(64bit) \
libosinfo-1.0.so.0(LIBOSINFO_0.2.8)(64bit) \
libosinfo-1.0.so.0(LIBOSINFO_0.2.9)(64bit) \
libosinfo-1.0.so.0(LIBOSINFO_1.3.0)(64bit) \
libosinfo-1.0.so.0(LIBOSINFO_1.4.0)(64bit) \
libosinfo-1.0.so.0(LIBOSINFO_1.7.0)(64bit) \
libsoup-3.0.so.0()(64bit) \
libspice-client-glib-2.0.so.8()(64bit) \
libspice-client-glib-2.0.so.8(SPICEGTK_1)(64bit) \
libspice-client-gtk-3.0.so.5()(64bit) \
libspice-client-gtk-3.0.so.5(SPICEGTK_1)(64bit) \
libusb-1.0.so.0()(64bit) \
libvirt-daemon-qemu \
libvirt-gconfig-1.0.so.0()(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.0.8)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.0.9)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.1.0)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.1.4)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.1.5)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.1.6)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.1.7)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.1.8)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.1.9)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.2.0)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.2.4)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_2.0.0)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_3.0.0)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_3.1.0)(64bit) \
libvirt-gobject-1.0.so.0()(64bit) \
libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_0.0.8)(64bit) \
libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_0.0.9)(64bit) \
libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_0.1.2)(64bit) \
libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_0.1.3)(64bit) \
libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_0.1.4)(64bit) \
libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_0.1.5)(64bit) \
libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_0.1.9)(64bit) \
libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_0.2.0)(64bit) \
libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_0.2.1)(64bit) \
libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_0.2.2)(64bit) \
libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_0.2.3)(64bit) \
libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_3.0.0)(64bit) \
libwebkit2gtk-4.1.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.7)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
mtools \
tracker \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
