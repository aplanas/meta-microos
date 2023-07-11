SUMMARY = "Virtual Machine Manager"
DESCRIPTION = "Virtual Machine Manager provides a graphical tool for administering virtual \
machines for KVM, Xen, and QEmu. Start, stop, add or remove virtual devices, \
connect to a graphical or serial console, and see resource usage statistics \
for existing VMs on local or remote machines. Uses libvirt as the backend \
management API."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "virt-manager-4.1.0-9.1.noarch.rpm"
RPM_HASH = "139f9001df1e73d396f35fe76de09dbe9238218eaa67d62e2dd043f83ac9340df58e706a810686b4afd658e102c5a127b6bb2b724f9a63be29c0991c5705ca7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "virt-manager"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
dbus-1-x11 \
dconf \
gstreamer-plugins-good \
gtk3 \
python3-cairo \
python3-gobject \
python3-gobject-Gdk \
python3-gobject-cairo \
typelib-AppIndicator3 \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-GtkSource \
typelib-GtkVnc \
typelib-LibvirtGLib \
typelib-Pango \
typelib-SpiceClientGLib \
typelib-SpiceClientGtk \
typelib-Vte \
virt-install \
virt-manager-common"

inherit rpm
