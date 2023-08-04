SUMMARY = "Virtual Machine Manager"
DESCRIPTION = "Virtual Machine Manager provides a graphical tool for administering virtual \
machines for KVM, Xen, and QEmu. Start, stop, add or remove virtual devices, \
connect to a graphical or serial console, and see resource usage statistics \
for existing VMs on local or remote machines. Uses libvirt as the backend \
management API."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "virt-manager-4.1.0-10.1.noarch.rpm"
RPM_HASH = "995fdd88495c57f472fdbb682d9e1d8338adfec57aaf4ef88bd0f126eab7961cf4c444d6db2bf77ef68d4bd7b61479b4a2dd23939b212cbbafdffe67e5d71760"
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
